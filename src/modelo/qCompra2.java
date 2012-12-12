package modelo;

import java.io.Serializable;

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
@Table (name="Compras")
public class qCompra2 implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="idcompra", unique=true, nullable=false)
	private int idcompra;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="pago", unique= true, nullable=true, insertable=true, updatable=true)
	private qPago2 pago;
	
	@Column(name="aprobado")
	private boolean aprobado;
	@Column(name="fechaaprobacion")
	private int fechaAprobacion;
	@Column(name="fechaCancelacion")
	private int fechaCancelacion;
	@Column(name="fechaCompra")
	private int fechaCompra;
	@Column(name="fechaEliminacion")
	private int fechaEliminacion;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="Asesorcomercial", unique= true, nullable=true, insertable=true, updatable=true)
	private qAsesorComercial2 AsesorComercial;
	
	@ManyToOne  (cascade=CascadeType.ALL)
	 @JoinColumn(name="Cliente", unique= true, nullable=true, insertable=true, updatable=true)
		private  qCliente2 Cliente;
	
	@ManyToOne  (cascade=CascadeType.ALL)
	 @JoinColumn(name="revisorcomercial", unique= true, nullable=true, insertable=true, updatable=true)
	private qRevisorComercial2 RevisorComercial;
	
	
	@Column(name="nombredeDominio")
	private String nombredeDominio;
	@Column(name="pagado")
	private boolean pagado;
	
	@ManyToOne  (cascade=CascadeType.ALL)
	@JoinColumn(name="paquetehosting", unique= true, nullable=true, insertable=true, updatable=true)
	private qPaqueteHosting2 paqueteHosting ;
	
	
	public int getIdcompra() {
		return idcompra;
	}


	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}


	public boolean isAprobado() {
		return aprobado;
	}


	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}


	public int getFechaAprobacion() {
		return fechaAprobacion;
	}


	public void setFechaAprobacion(int fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}


	public int getFechaCancelacion() {
		return fechaCancelacion;
	}


	public void setFechaCancelacion(int fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}


	public int getFechaCompra() {
		return fechaCompra;
	}


	public void setFechaCompra(int fechaCompra) {
		this.fechaCompra = fechaCompra;
	}


	public int getFechaEliminacion() {
		return fechaEliminacion;
	}


	public void setFechaEliminacion(int fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}


	public qAsesorComercial2 getAsesorComercial() {
		return AsesorComercial;
	}


	public void setAsesorComercial(qAsesorComercial2 asesorComercial) {
		AsesorComercial = asesorComercial;
	}


	public qCliente2 getCliente() {
		return Cliente;
	}


	public void setCliente(qCliente2 cliente) {
		Cliente = cliente;
	}


	


	public String getNombredeDominio() {
		return nombredeDominio;
	}


	public void setNombredeDominio(String nombredeDominio) {
		this.nombredeDominio = nombredeDominio;
	}


	public boolean isPagado() {
		return pagado;
	}


	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}


	public qPaqueteHosting2 getPaqueteHosting() {
		return paqueteHosting;
	}


	public void setPaqueteHosting(qPaqueteHosting2 paqueteHosting) {
		this.paqueteHosting = paqueteHosting;
	}


	public qPago2 getPago() {
		return pago;
	}


	public void setPago(qPago2 pago) {
		this.pago = pago;
	}


	public qRevisorComercial2 getRevisorComercial() {
		return RevisorComercial;
	}


	public void setRevisorComercial(qRevisorComercial2 revisorComercial) {
		RevisorComercial = revisorComercial;
	}


	public qCompra2() {
		
		// TODO Auto-generated constructor stub
	}

}
