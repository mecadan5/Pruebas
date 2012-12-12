package modelo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
public class qDistribuidor2 extends qUsuario2{
	
	@OneToMany(mappedBy="listaDeCliente")
	@JoinColumn(name="id_administrador", unique= true, nullable=true, insertable=true, updatable=true)
	private List<qClientes2> listaDeCliente;
	
	private int tipoDeCuenta;
	
	public qDistribuidor2() {
		// TODO Auto-generated constructor stub
	}

}
