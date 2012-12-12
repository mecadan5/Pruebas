package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class qCheque2 extends qPago2 {
	@Column(name="fechacheque")
	int fecha;
	@Column(name="lugar")
	String lugar;
	@Column(name="nombrebanco")
	String nombreBanco;
	@Column(name="numeroCheque")
	int numeroCheque;
	@Column(name="numeroCuenta")
	int numeroCuenta;
	
	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public int getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(int numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public qCheque2() {
		// TODO Auto-generated constructor stub
	}

}
