package modelo;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table (name="comision")
public class qComision2 {
	private qDistribuidor2 distribuidor;///id o objeto distribuidor???
	private boolean aprobadoComision;
	private int idComision;
	private int mesComision;
	private float porcentaje;
	public qComision2() {
		// TODO Auto-generated constructor stub
	}

}
