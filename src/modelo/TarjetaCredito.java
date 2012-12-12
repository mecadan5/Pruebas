package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
@Entity
public class TarjetaCredito extends Pago{
	@Column(name="ClasedeTarjeta")
	String claseDeTarjeta;
	@Column(name="Fechatarjeta")
	int Fecha;
	@Column(name="nombrePropietario")
	String nombrePropietario;
	@Column(name="numeroTarjeta")
	int numeroTarjeta;
	
	public String getClaseDeTarjeta() {
		return claseDeTarjeta;
	}
	public void setClaseDeTarjeta(String claseDeTarjeta) {
		this.claseDeTarjeta = claseDeTarjeta;
	}
	public int getFecha() {
		return Fecha;
	}
	public void setFecha(int fecha) {
		Fecha = fecha;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public TarjetaCredito() {
		// TODO Auto-generated constructor stub
	}

}
