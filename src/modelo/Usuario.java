package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tabla_usuarios")
public  class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	Long id;
	
	String nombre;
	String contrasenia;	
	//Long idcupo;
	//@OneToOne(optional=false,cascade =CascadeType.MERGE,fetch=FetchType.EAGER)
	@OneToOne(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST,CascadeType.REMOVE},orphanRemoval=true,optional=false)
	//@JoinColumn(name="idcupo", referencedColumnName="id")
	private Cupo cupo;
	
	public Cupo getCupo() {
		return cupo;
	}
	public void setCupo(Cupo cupo) {
		this.cupo = cupo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getcontrasenia() {
		return contrasenia;
	}
	public void setcontrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
	
	/*Long cupo_asignado;
	Long sobre_cupo_asignado;
	Long cupo_total;
	Long cupo_consumido;
	public Long getcupo_asignado() {
		return cupo_asignado;
	}
	public void setcupo_asignado(Long cupo_asignado) {
		this.cupo_asignado = cupo_asignado;
	}
	public Long getsobre_cupo_asignado() {
		return sobre_cupo_asignado;
	}
	public void setsobre_cupo_asignado(Long sobre_cupo_asignado) {
		this.sobre_cupo_asignado = sobre_cupo_asignado;
	}
	public Long getCupo_total() {
		return cupo_total;
	}
	public void setCupo_total(Long cupo_total) {
		this.cupo_total = cupo_total;
	}
	public Long getcupo_consumido() {
		return cupo_consumido;
	}
	public void setcupo_consumido(Long cupo_consumido) {
		this.cupo_consumido = cupo_consumido;
	}*/
	
}
