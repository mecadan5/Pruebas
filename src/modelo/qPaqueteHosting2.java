<<<<<<< HEAD
package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="paqueteHosting")
public class qPaqueteHosting2 implements Serializable {
		
		@Id
		@GeneratedValue
		@Column(name="idpaquete", unique=true , nullable=false)
		private int idPaquete=0;
		@Column(name="correoscorporativos")
		private int correosCorportaivos;
		@Column(name="espacioendisco")
		private int espacioendisco;
		
		
		@ManyToOne  (cascade=CascadeType.ALL)
		  @JoinColumn(name="id_administrador", unique= true, nullable=true, insertable=true, updatable=true)
		private qAdministrador Administradorpre;
		@Column(name="numeroBaseDeDatos")
		private int numeroBaseDeDatos;
		@Column(name="plataforma")
		private String plataforma;
		@Column(name="valorMensual")
		private float valorMensual;
		@Column(name="valorSemestral")
		private float valorSemestral;
		@Column(name="valorTrimestral")
		private float valorTrimestral;
		@Column(name="valorAnual")
		private float valorAnual;
		@Column(name="versionPhp")
		private String versionPhp;
		
		
	public int getIdPaquete() {
			return idPaquete;
		}


		public void setIdPaquete(int idPaquete) {
			this.idPaquete = idPaquete;
		}


		public int getCorreosCorportaivos() {
			return correosCorportaivos;
		}


		public void setCorreosCorportaivos(int correosCorportaivos) {
			this.correosCorportaivos = correosCorportaivos;
		}


		public int getEspacioendisco() {
			return espacioendisco;
		}


		public void setEspacioendisco(int espacioendisco) {
			this.espacioendisco = espacioendisco;
		}


		public qAdministrador getAdministrador() {
			return Administradorpre;
		}


		public void setAdministrador(qAdministrador administrador) {
			this.Administradorpre = administrador;
		}


		public int getNumeroBaseDeDatos() {
			return numeroBaseDeDatos;
		}


		public void setNumeroBaseDeDatos(int numeroBaseDeDatos) {
			this.numeroBaseDeDatos = numeroBaseDeDatos;
		}


		public String getPlataforma() {
			return plataforma;
		}


		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}


		public float getValorMensual() {
			return valorMensual;
		}


		public void setValorMensual(float valorMensual) {
			this.valorMensual = valorMensual;
		}


		public float getValorSemestral() {
			return valorSemestral;
		}


		public void setValorSemestral(float valorSemestral) {
			this.valorSemestral = valorSemestral;
		}


		public float getValorTrimestral() {
			return valorTrimestral;
		}


		public void setValorTrimestral(float valorTrimestral) {
			this.valorTrimestral = valorTrimestral;
		}


		public float getValorAnual() {
			return valorAnual;
		}


		public void setValorAnual(float valorAnual) {
			this.valorAnual = valorAnual;
		}


		public String getVersionPhp() {
			return versionPhp;
		}


		public void setVersionPhp(String versionPhp) {
			this.versionPhp = versionPhp;
		}


	public qPaqueteHosting2() {
		// TODO Auto-generated constructor stub
	}

}
=======
package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="paqueteHosting")
public class qPaqueteHosting2 implements Serializable {
		
		@Id
		@GeneratedValue
		@Column(name="idpaquete", unique=true , nullable=false)
		private int idPaquete=0;
		@Column(name="correoscorporativos")
		private int correosCorportaivos;
		@Column(name="espacioendisco")
		private int espacioendisco;
		
		
		@ManyToOne  (cascade=CascadeType.ALL)
		  @JoinColumn(name="id_administrador", unique= true, nullable=true, insertable=true, updatable=true)
		private qAdministrador Administradorpre;
		@Column(name="numeroBaseDeDatos")
		private int numeroBaseDeDatos;
		@Column(name="plataforma")
		private String plataforma;
		@Column(name="valorMensual")
		private float valorMensual;
		@Column(name="valorSemestral")
		private float valorSemestral;
		@Column(name="valorTrimestral")
		private float valorTrimestral;
		@Column(name="valorAnual")
		private float valorAnual;
		@Column(name="versionPhp")
		private String versionPhp;
		
		
	public int getIdPaquete() {
			return idPaquete;
		}


		public void setIdPaquete(int idPaquete) {
			this.idPaquete = idPaquete;
		}


		public int getCorreosCorportaivos() {
			return correosCorportaivos;
		}


		public void setCorreosCorportaivos(int correosCorportaivos) {
			this.correosCorportaivos = correosCorportaivos;
		}


		public int getEspacioendisco() {
			return espacioendisco;
		}


		public void setEspacioendisco(int espacioendisco) {
			this.espacioendisco = espacioendisco;
		}


		public qAdministrador getAdministrador() {
			return Administradorpre;
		}


		public void setAdministrador(qAdministrador administrador) {
			this.Administradorpre = administrador;
		}


		public int getNumeroBaseDeDatos() {
			return numeroBaseDeDatos;
		}


		public void setNumeroBaseDeDatos(int numeroBaseDeDatos) {
			this.numeroBaseDeDatos = numeroBaseDeDatos;
		}


		public String getPlataforma() {
			return plataforma;
		}


		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}


		public float getValorMensual() {
			return valorMensual;
		}


		public void setValorMensual(float valorMensual) {
			this.valorMensual = valorMensual;
		}


		public float getValorSemestral() {
			return valorSemestral;
		}


		public void setValorSemestral(float valorSemestral) {
			this.valorSemestral = valorSemestral;
		}


		public float getValorTrimestral() {
			return valorTrimestral;
		}


		public void setValorTrimestral(float valorTrimestral) {
			this.valorTrimestral = valorTrimestral;
		}


		public float getValorAnual() {
			return valorAnual;
		}


		public void setValorAnual(float valorAnual) {
			this.valorAnual = valorAnual;
		}


		public String getVersionPhp() {
			return versionPhp;
		}


		public void setVersionPhp(String versionPhp) {
			this.versionPhp = versionPhp;
		}


	public qPaqueteHosting2() {
		// TODO Auto-generated constructor stub
	}

}
>>>>>>> branch 'master' of https://github.com/mecadan5/Pruebas.git
