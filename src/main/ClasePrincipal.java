
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
			map.persistirObjeto(mc);
			
			donal.setEmail("email 2");
			
			
			Distribuidor lo = mc.getDistribuidor();
			Long sal = lo.getId();
			System.out.println(sal);
			map.persistirObjeto(donal);
			
			Comision xComision2 =new Comision();
			xComision2.setMesComision(10);
			map.persistirObjeto(xComision2);
			
			Compra a=new Compra();
			a.setAprobado(true);
			a.setNombredeDominio("pepitoperew");
			map.persistirObjeto(a);
			 
			Administrador admin11=new Administrador();
			admin11.setContrasenia("admin");
			admin11.setNombre("admin");
			
			
			//5555555555555555caramba
			Administrador admin22=new Administrador();
			admin22.setContrasenia("admina");
			admin22.setNombre("admina");
			map.persistirObjeto(admin22);
			
			Administrador admin33=new Administrador();
			admin33.setContrasenia("adminb");
			admin33.setNombre("adminb");
			map.persistirObjeto(admin33);
			
			
			
			PaqueteHosting pruebaHosting2 =new PaqueteHosting();
			pruebaHosting2.setAdministrador(admin33);			
			pruebaHosting2.setPlataforma("linux");
			
			map.persistirObjeto(pruebaHosting2);
			
			
			
			
			TarjetaCredito tarjetaprueba =new TarjetaCredito();
			tarjetaprueba.setNumeroTarjeta(50);
			map.persistirObjeto(tarjetaprueba);
			TarjetaCredito tarjetaprueba2 =new TarjetaCredito();
			tarjetaprueba2.setNumeroTarjeta(506666);
			map.persistirObjeto(tarjetaprueba2);
			Cheque chequedeprueba= new Cheque();
			chequedeprueba.setLugar("bogota");
			Cheque chequedeprueba2= new Cheque();
			chequedeprueba.setLugar("pereira");
			map.persistirObjeto(chequedeprueba2);
			map.persistirObjeto(chequedeprueba);
		
		
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
		
		opcion = Integer.parseInt(br.readLine());
		
		switch(opcion){
			
		case 1:
			p.crearNuevosregistros();
			break;
		
		
			
		}
		
		}while(opcion!=1);

	}
	
}

