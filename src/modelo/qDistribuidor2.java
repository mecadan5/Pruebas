package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class qDistribuidor2 extends qUsuario2{
	private List listaDecliente;
	@OneToMany(cascade=ALL, mappedBy="qdistribuidor")
	private List<qCliente2> listaDeCliente2;
	
	private int tipoDeCuenta;
	public void addcliente(qCliente2 cliente) {
        this.listaDecliente.add(cliente);
        if (cliente.getDistribuidor() != this) {
            cliente.setDistribuidor(this);
        }
    }
	public qDistribuidor2() {
		// TODO Auto-generated constructor stub
	}

}
