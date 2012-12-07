package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tabla_usuarios2")
public class qUsuario2 {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String email;// debera contener una restriccion  con utilizacion @
	private int idUsuario;
	private String nombre=null;
	@OneToOne(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST,CascadeType.REMOVE},orphanRemoval=true,optional=false)
	
	public qUsuario2() {
		// TODO Auto-generated constructor stub
		
	}
	
	public boolean cambiarcontrasenia(String contraseniaAntigua, String contraseniaNueva){
		boolean contraseniacambiada=false;
		return  contraseniacambiada;
	}
	

}
