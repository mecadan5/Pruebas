/*package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import IGU.IguAdministrador;
import IGU.IguRegistrador;

import modelo.Cupo;
import modelo.Poligamo;
import modelo.Usuario;

public class JpaPoligamo {
		private static final String PERSISTENCE_UNIT_NAME = "gente";
		private EntityManagerFactory fabrica;
	
		public void JpaPoligamo(){
		
	}
	
	public void crearJpaPoligamo(String nombre, String contrasenia, int fechanacimiento){
		fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = fabrica.createEntityManager();
		// Empezar una transaccion local para poder crear persistencias
		em.getTransaction().begin();
		Poligamo poligamo = new Poligamo();
		poligamo.setNombre(nombre);
		poligamo.setcontrasenia(contrasenia);
		poligamo.setFechaNacimiento(fechanacimiento);
		em.persist(poligamo);
		em.getTransaction().commit();
		em.close();
		
	}
	public void eliminarJpaPoligamo(Long id2){
		fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.id = :id1");
		q.setParameter("id1",id2 );//campo de arriba "Juana_0"  getUsuario()   "sssss"
		Poligamo poligamo1 = (Poligamo) q.getSingleResult();
		em.remove(poligamo1);
		em.getTransaction().commit();
		em.close();
		////llamar metodo de borrado de todas las esposas
	}
	public Poligamo abrirJpaPoligamo(Long id2){
		fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.id = :id1");
		q.setParameter("id1",id2 );//campo de arriba "Juana_0"  getUsuario()   "sssss"
		Poligamo poligamo1 = (Poligamo) q.getSingleResult();
		em.getTransaction().commit();
		em.close();
		return poligamo1;
	}
	public void ModificariJpaPoligamo(Long id2, String nombre, String contrasenia, Long vrCupo, Long vrScupo){
		fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.id = :id1");
		q.setParameter("id1",id2 );//campo de arriba "Juana_0"  getUsuario()   "sssss"
		Poligamo poligamo1 = (Poligamo) q.getSingleResult();
		poligamo1.setcontrasenia(contrasenia);
		poligamo1.setNombre(nombre);
		Cupo cupo1= new Cupo();
		cupo1.setCupo_asignado(vrCupo);
		cupo1.setSobre_cupo_asignado(vrScupo);
		em.persist(cupo1);
		em.getTransaction().commit();
		cupo1.getId();
		poligamo1.setIdcupo(cupo1.getId());
		em.refresh(poligamo1);
		em.getTransaction().commit();
		em.close();
		
		
		
	}
	
}*/
