package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Esposa extends Usuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	Long id;
	
	
	@OneToMany
	@JoinTable(name = "EsposaCompra", joinColumns = @JoinColumn(name = "CompraE"), inverseJoinColumns = @JoinColumn(name = "EsposaC")) 
	List<Transaccion> compra = new ArrayList<Transaccion>();
	@ManyToOne
	Poligamo marido;
		
	
	public List<Transaccion> getCompra() {
		return compra;
	}
	public void setCompra(List<Transaccion> compra) {
		this.compra = compra;
	}
	
	
	public Poligamo getMarido() {
		return marido;
	}
	public void setMarido(Poligamo marido) {
		this.marido = marido;
	}
	
}

