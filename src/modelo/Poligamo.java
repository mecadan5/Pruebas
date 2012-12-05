package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;


@Entity
public class Poligamo extends Usuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	Long id;
	int fechaNacimiento;
	//@Transient
	
	//int edad;
	//@Embedded
	//@Column(name="Contacto")
	//DatosContacto datosContacto;
	@OneToMany(mappedBy="marido")
	List<Esposa> esposas = new ArrayList<Esposa>();
	
	public List<Esposa> getEsposas() {
		return esposas;
	}
	public void setEsposas(List<Esposa> esposas) {
		this.esposas = esposas;
	}
	public int getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
