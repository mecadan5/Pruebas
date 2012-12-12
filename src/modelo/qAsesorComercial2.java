package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;

@Entity
public class qAsesorComercial2 extends qUsuario2 {

	
	private List<qCliente2> clientesAtendidos;
	
	
	private List<qCompra2> comprasRealizadas;
	
	
	
	
	public qAsesorComercial2() {
		// TODO Auto-generated constructor stub
		
	}

}
