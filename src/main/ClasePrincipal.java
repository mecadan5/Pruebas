package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import IGU.Inicio;
import IGU.login;


import modelo.Administrador;
import modelo.Cupo;
import modelo.Esposa;
import modelo.Poligamo;
import modelo.Transaccion;
import modelo.Registrador;
import modelo.Usuario;
import modelo.qAdministrador;
import modelo.qCheque2;
import modelo.qEfectivo2;
import modelo.qPaqueteHosting2;
import modelo.qTarjetaCredito2;

public class ClasePrincipal {
	
	private static final String PERSISTENCE_UNIT_NAME = "gente";
	private EntityManagerFactory fabrica;
	
	public void crearNuevosregistros() throws Exception{
		fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		
		EntityManager em = fabrica.createEntityManager();

		// Empezar una transaccion local para poder crear persistencias
		em.getTransaction().begin();
		
		// Leer los registros existentes
		Query q = em.createQuery("select m from qUsuario2 m");
					
			qAdministrador admin11=new qAdministrador();
			admin11.setContrasenia("admin");
			admin11.setNombre("admin");
			em.persist(admin11);
			//5555555555555555
			qAdministrador admin22=new qAdministrador();
			admin22.setContrasenia("admina");
			admin22.setNombre("admina");
			em.persist(admin22);
			
			qAdministrador admin33=new qAdministrador();
			admin33.setContrasenia("adminb");
			admin33.setNombre("adminb");
			em.persist(admin33);
			
			//em.getTransaction().commit();
			
			//em.getTransaction().begin();
			
			qPaqueteHosting2 pruebaHosting2 =new qPaqueteHosting2();
			pruebaHosting2.setAdministrador(admin33);			
			pruebaHosting2.setPlataforma("linux");
			
			em.persist(pruebaHosting2);
			
			//em.getTransaction().commit();
			
			
			qTarjetaCredito2 tarjetaprueba =new qTarjetaCredito2();
			tarjetaprueba.setNumeroTarjeta(50);
			em.persist(tarjetaprueba);
			qTarjetaCredito2 tarjetaprueba2 =new qTarjetaCredito2();
			tarjetaprueba2.setNumeroTarjeta(506666);
			em.persist(tarjetaprueba2);
			qCheque2 chequedeprueba= new qCheque2();
			chequedeprueba.setLugar("bogota");
			qCheque2 chequedeprueba2= new qCheque2();
			chequedeprueba.setLugar("pereira");
			em.persist(chequedeprueba2);
			em.persist(chequedeprueba);
		
		em.getTransaction().commit();

		
		em.close();
	}
	public void configurar() throws Exception{
		fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = fabrica.createEntityManager();

		// Empezar una transaccion local para poder crear persistencias
		em.getTransaction().begin();
		
		// Leer los registros existentes
		Query q = em.createQuery("select m from Usuario m");
		// Deberia estar vacia
		boolean createNewEntries = (q.getResultList().size() == 0);
		
		
		
		if (createNewEntries) {
			
			/*//prueba
			qAdministrador admin11=new qAdministrador();
			admin11.setContrasenia("admin");
			admin11.setNombre("admin");
			em.persist(admin11);*/
			//finprueba
			
			Poligamo poligamo = new Poligamo();
			
	
			poligamo.setNombre("Asrahir");
			poligamo.setcontrasenia("000000");
			poligamo.setFechaNacimiento(12011967);
			poligamo.getId();
			Cupo cupo =new Cupo();
			Long a =(long) 2000;
			cupo.setCupo_asignado(a);
			cupo.setSobre_cupo_asignado(a);
			em.persist(cupo);
			poligamo.setCupo(cupo);
			em.persist(poligamo);
			Registrador registra = new Registrador();
			registra.setNombre("sssss");
			registra.setcontrasenia("sss");
			registra.setFechaNacimiento(12011967);
			em.persist(registra);
			Administrador admin =new Administrador();
			admin.setNombre("aa");
			admin.setcontrasenia("aa");
			admin.setFechaNacimiento(12011991);
			em.persist(admin);
			for(int i=0;i<20;i++){
			Esposa esposa = new Esposa();
			esposa.setNombre("Juana_"+i);
			esposa.setcontrasenia("de Asnab");
			//int a =100;
			//Long h =(long)a;
			//esposa.setcupo_asignado(h*i);
			esposa.setMarido(poligamo);
			poligamo.getEsposas().add(esposa);
			em.persist(esposa);
			em.persist(poligamo);
			
			}
		}
		
		
		em.getTransaction().commit();

		
		em.close();
	}
	
	public void comprar (){
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.nombre = :primerNombre AND e.contrasenia = :contrasenia");
		q.setParameter("primerNombre", "Juana_14");
		q.setParameter("contrasenia", "de Asnab");
		Esposa usuario = (Esposa) q.getSingleResult();
		//System.out.println(usuario.getcupo_asignado());
		
		Transaccion compra = new Transaccion();
		compra.setFecha(220112);
		compra.setMonto(100);
		em.persist(compra);
		
		Transaccion compra2 = new Transaccion();
		compra2.setFecha(221215);
		compra2.setMonto(150);
		em.persist(compra2);
		
		usuario.getCompra().add(compra);
		usuario.getCompra().add(compra2);
		em.persist(usuario);
		
		em.getTransaction().commit();
		em.close();
	}
	
	public void borrar(){
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.nombre = :primerNombre AND e.contrasenia = :contrasenia");
		q.setParameter("primerNombre", "Juana_1");
		q.setParameter("contrasenia", "de Asnab");
		Usuario usuario1 = (Usuario) q.getSingleResult();
		System.out.println(usuario1.getcontrasenia());
		em.remove(usuario1);
		em.getTransaction().commit();
		em.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		login ini = new login();
		ini.setVisible(true);
		//System.out.println(verifica.getTxtIU());
		//System.out.println(verifica.getTxtPS());
		
		ClasePrincipal p = new ClasePrincipal();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        int opcion = 0;
        
		do{
        System.out.println("1-Crear Registros");
		System.out.println("2-Comprar ");
		System.out.println("3-Borrar ");
		System.out.println("4-crearnuevos");
		opcion = Integer.parseInt(br.readLine());
		
		switch(opcion){
			
		case 1:
			p.configurar();
			break;
		
		case 2:
			p.comprar();
			break;
		
		case 3:
			p.borrar();
			break;
		case 4:
			p.crearNuevosregistros();
		
		}
		
		}while(opcion!=5);

	}
	
}
