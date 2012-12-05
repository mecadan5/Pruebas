package modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Access(AccessType.PROPERTY)
public class Transaccion {
	

	private String id;
	
	long monto;
	long fecha;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="MontoEnPesos")
	public long getMonto() {
		
		return monto;
	}
	public void setMonto(long monto) {
		this.monto = monto;
	}
	public long getFecha() {
		return fecha;
	}
	public void setFecha(long fecha) {
		this.fecha = fecha;
	}

}
