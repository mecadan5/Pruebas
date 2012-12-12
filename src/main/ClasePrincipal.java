

package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import IGU.Inicio;
import IGU.login;



import modelo.qAdministrador;
import modelo.qCheque2;
import modelo.qComision2;
import modelo.qCompra2;
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
					
			qComision2 xComision2 =new qComision2();
			xComision2.setMesComision(10);
			em.persist(xComision2);
			
			qCompra2 a=new qCompra2();
			a.setAprobado(true);
			a.setNombredeDominio("pepitoperew");
			em.persist(a);
			 
			qAdministrador admin11=new qAdministrador();
			admin11.setContrasenia("admin");
			admin11.setNombre("admin");
			em.persist(admin11);
			//5555555555555555caramba
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
			
			
			//int a =100;
			//Long h =(long)a;
			//esposa.setcupo_asignado(h*i);
			
			
			}
		}
		
		
		
	
	
	public void comprar (){
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.nombre = :primerNombre AND e.contrasenia = :contrasenia");
		q.setParameter("primerNombre", "Juana_14");
		q.setParameter("contrasenia", "de Asnab");
		
	}
	
	public void borrar(){
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.nombre = :primerNombre AND e.contrasenia = :contrasenia");
		q.setParameter("primerNombre", "Juana_1");
		q.setParameter("contrasenia", "de Asnab");
		//Usuario usuario1 = (Usuario) q.getSingleResult();
		
		//em.remove(usuario1);
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

=======
>>>>>>> 49bff02de7f2f89a7e8a218dc3bc6a1ce2e1c71b
package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sun.jndi.url.dns.dnsURLContext;


import IGU.Inicio;
import IGU.login;



import modelo.Administrador;
import modelo.Cheque;
import modelo.Cliente;
import modelo.Comision;
import modelo.Compra;
import modelo.Distribuidor;
import modelo.Efectivo;
import modelo.PaqueteHosting;
import modelo.TarjetaCredito;
import persistencia.MapeadorUsuario;

public class ClasePrincipal {
	
	
	
	public void crearNuevosregistros() throws Exception{
		

		// Empezar una transaccion local para poder crear persistencias
		
		
		// Leer los registros existentes
		//Query q = em.createQuery("select m from Usuario m");
			MapeadorUsuario	map=new MapeadorUsuario();	
			Cliente  mc =new Cliente();
			mc.setEmail("funcionando");
			
			
			
			Distribuidor donal =new Distribuidor();
			mc.setDistribuidor(donal);
			mc.getDistribuidor();
			map
			
			donal.setEmail("email 2");
			
			em.persist(donal);
			Distribuidor lo = mc.getDistribuidor();
			Long sal = lo.getId();
			System.out.println(sal);
			
			
			Comision xComision2 =new Comision();
			xComision2.setMesComision(10);
			em.persist(xComision2);
			
			Compra a=new Compra();
			a.setAprobado(true);
			a.setNombredeDominio("pepitoperew");
			em.persist(a);
			 
			Administrador admin11=new Administrador();
			admin11.setContrasenia("admin");
			admin11.setNombre("admin");
			em.persist(admin11);
			//5555555555555555caramba
			Administrador admin22=new Administrador();
			admin22.setContrasenia("admina");
			admin22.setNombre("admina");
			em.persist(admin22);
			
			Administrador admin33=new Administrador();
			admin33.setContrasenia("adminb");
			admin33.setNombre("adminb");
			em.persist(admin33);
			
			
			
			PaqueteHosting pruebaHosting2 =new PaqueteHosting();
			pruebaHosting2.setAdministrador(admin33);			
			pruebaHosting2.setPlataforma("linux");
			
			em.persist(pruebaHosting2);
			
			
			
			
			TarjetaCredito tarjetaprueba =new TarjetaCredito();
			tarjetaprueba.setNumeroTarjeta(50);
			em.persist(tarjetaprueba);
			TarjetaCredito tarjetaprueba2 =new TarjetaCredito();
			tarjetaprueba2.setNumeroTarjeta(506666);
			em.persist(tarjetaprueba2);
			Cheque chequedeprueba= new Cheque();
			chequedeprueba.setLugar("bogota");
			Cheque chequedeprueba2= new Cheque();
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
			
			
			//int a =100;
			//Long h =(long)a;
			//esposa.setcupo_asignado(h*i);
			
			
			}
		}
		
		
		
	
	
	public void comprar (){
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.nombre = :primerNombre AND e.contrasenia = :contrasenia");
		q.setParameter("primerNombre", "Juana_14");
		q.setParameter("contrasenia", "de Asnab");
		
	}
	
	public void borrar(){
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.nombre = :primerNombre AND e.contrasenia = :contrasenia");
		q.setParameter("primerNombre", "Juana_1");
		q.setParameter("contrasenia", "de Asnab");
		//Usuario usuario1 = (Usuario) q.getSingleResult();
		
		//em.remove(usuario1);
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
<<<<<<< HEAD
=======
>>>>>>> 351063f6e1c518e86682882700e9531a45d87ad1
>>>>>>> 49bff02de7f2f89a7e8a218dc3bc6a1ce2e1c71b
