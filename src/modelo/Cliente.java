package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cliente extends Usuario{
	@Column(name="direcion")
	private String direcion;
	@ManyToOne
	@JoinColumn(name="distribuidor_ID",referencedColumnName="distribuidor_ID", insertable =false,updatable =false)
	private Distribuidor distribuidor;
	
	public String getDirecion() {
		return direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public Distribuidor getDistribuidor() {
		return distribuidor;
	}

	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
		/*if(!distribuidor.getListaDecliente().contains(this)){
			distribuidor.getListaDecliente().add(this);
		}*/
		
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean ValidarDirecion(String direccionAValidar){
		boolean valido=false;
		return valido;
	}

}
