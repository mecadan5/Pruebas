package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table (name="comision")
public class qComision2 {
	@Id
	@GeneratedValue
	@Column(name="idcomision", unique=true, nullable=false)
	private int idComision;
	@ManyToOne  (cascade=CascadeType.ALL)
	@JoinColumn(name="distribuidor", unique= true, nullable=true, insertable=true, updatable=true)
	private qDistribuidor2 distribuidor;
	@Column(name="aprobadocomision")
	private boolean aprobadoComision;
	@Column(name="mescomision")
	private int mesComision;
	@Column(name="porcentaje")
	private float porcentaje;
	
	public int getIdComision() {
		return idComision;
	}

	public void setIdComision(int idComision) {
		this.idComision = idComision;
	}

	public qDistribuidor2 getDistribuidor() {
		return distribuidor;
	}

	public void setDistribuidor(qDistribuidor2 distribuidor) {
		this.distribuidor = distribuidor;
	}

	public boolean isAprobadoComision() {
		return aprobadoComision;
	}

	public void setAprobadoComision(boolean aprobadoComision) {
		this.aprobadoComision = aprobadoComision;
	}

	public int getMesComision() {
		return mesComision;
	}

	public void setMesComision(int mesComision) {
		this.mesComision = mesComision;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public qComision2() {
		// TODO Auto-generated constructor stub
	}

}
