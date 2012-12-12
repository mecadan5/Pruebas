package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;

@Entity
public class AsesorComercial extends Usuario {

	
	private List<Cliente> clientesAtendidos;
	
	
	private List<Compra> comprasRealizadas;
	
	
	
	
	public AsesorComercial() {
		// TODO Auto-generated constructor stub
		
	}

}
