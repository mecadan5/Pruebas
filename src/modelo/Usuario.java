package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.eclipse.persistence.jaxb.javamodel.JavaAnnotation;

@Entity
@Table(name="tabla_usuarios2")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Usuario implements Serializable {
	
	
	
	private String email;// debera contener una restriccion  con utilizacion @
	String nombre;
	//@OneToOne(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST,CascadeType.REMOVE},orphanRemoval=true,optional=false)
	@Id
	@GeneratedValue
	@Column(name="idUsuario", unique=true , nullable=false)
	Long idUsuario;
	public Long getId() {
		return idUsuario;
	}

	public void setId(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	@Column (name="email",length=10)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 
	@Column (name= "nombre",nullable=false, length =50)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name="Contrasenia", length=20)
	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	String Contrasenia;
	
	//@OneToOne(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST,CascadeType.REMOVE},orphanRemoval=true,optional=false)
	
	public Usuario() {
		// TODO Auto-generated constructor stub
		
	}
	
	public boolean cambiarcontrasenia(String contraseniaAntigua, String contraseniaNueva){
		boolean contraseniacambiada=false;
		return  contraseniacambiada;
	}
	

}
