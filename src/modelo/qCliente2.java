package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class qCliente2 extends qUsuario2{
	@Column(name="direcion")
	private String direcion;
	@ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="distribuidor_ID")
	private qDistribuidor2 distribuidor;
	
	public String getDirecion() {
		return direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public qDistribuidor2 getDistribuidor() {
		return distribuidor;
	}

	public void setDistribuidor(qDistribuidor2 distribuidor) {
		this.distribuidor = distribuidor;
	}

	public qCliente2() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean ValidarDirecion(String direccionAValidar){
		boolean valido=false;
		return valido;
	}

}
