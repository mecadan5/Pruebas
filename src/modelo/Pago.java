package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Pagos")
public class Pago implements Serializable{
	
	private int idPago;
	@Id
	@GeneratedValue
	@Column(name="id", unique=true, nullable=false)
	public int getIdPago() {
		return idPago;
	}


	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}
	private float valorPago;
	@Column(name="ValorPago")
	public float getValorPago() {
		return valorPago;
	}


	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}


	
	
	
	public Pago() {
		// TODO Auto-generated constructor stub
	}

}
