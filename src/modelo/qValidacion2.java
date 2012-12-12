package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Validacion")

public class qValidacion2 implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="id", unique=true, nullable =false)
	
	private String contrasenia="CHIBCHAWEBPASSWORDS";
	
	private int idUsuario=0;
	private qRol2 roles[];
	
	public qValidacion2() {
		// TODO Auto-generated constructor stub
	}
	
	public   boolean  ValidarUsuario(String contrasenia,int idUsuario ){
		boolean valido =false;
		//operaciones
		return valido;
				
	}
	public boolean cambiarcontrasenia(String contraseniaAntigua, String contraseniaNueva){
		boolean contraseniacambiada=false;
		return  contraseniacambiada;
	}

}
