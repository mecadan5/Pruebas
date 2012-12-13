package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class MapeadorUsuario {
	
	private static final String PERSISTENCE_UNIT_NAME = "gente";
	
	private EntityManagerFactory fabrica;
	
	private EntityManager  em;
	
   

    public void borrarObjeto(Object objeto){
        em.getTransaction().begin();
        try{
            em.remove(objeto);
            em.getTransaction().commit();
        } catch (PersistenceException e) {
            e.getCause().toString();
            em.getTransaction().rollback();
        }
    }
    
    public Object consultarObjeto (Class clase, int llave){
        Object temp = null;
        temp = new Object();
        em.getTransaction().begin();
        try {
            temp = em.find(clase, llave);
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        em.getTransaction().commit();
        return temp;
    
    }
    
    public boolean realizarQuery(int idCliente, int idEsposa){
        
        em.getTransaction().begin();
        System.out.println("Entra a consultas query");
        em.createNativeQuery("SELECT identificacion_pk" + " FROM esposa " + " WHERE fk_cliente = " + idCliente +  " AND identifiacion_pk = " + idEsposa + ";").getSingleResult();
        System.out.println("q = " + em);
        em.close();
        return true;
    }

    public void persistirObjeto(Object objeto){
        em.getTransaction().begin();
        try{
            System.out.println("objeto cliente: " + objeto);
            em.persist(objeto);
            em.getTransaction().commit();
            
            
        } catch (PersistenceException e) {
            e.getCause().toString();
          //  em.getTransaction().rollback();
        }
    }
    
    public void modificarObjeto(Object objeto){
    	em.getTransaction().begin();
        try{
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (PersistenceException e) {
            e.getCause().toString();
            em.getTransaction().rollback();
        }
    }

    public MapeadorUsuario() {
    	fabrica = Persistence.createEntityManagerFactory("gente");
    	em = fabrica.createEntityManager();
		// TODO Auto-generated constructor stub
	}

}
