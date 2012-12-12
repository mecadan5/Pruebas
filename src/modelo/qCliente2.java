package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class qCliente2 extends qUsuario2{
	@Column(name="direcion")
	private String direcion;
	
	private qDistribuidor2 distribuidor;
	
	public qCliente2() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean ValidarDirecion(String direccionAValidar){
		boolean valido=false;
		return valido;
	}

}
