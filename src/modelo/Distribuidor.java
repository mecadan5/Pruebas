package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Distribuidor extends Usuario{
	
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="distribuidor",targetEntity=Cliente.class)
		private List<Cliente> listaDecliente;

	private int tipoDeCuenta;
	/*
	public void addcliente(qCliente2 cliente) {
        this.listaDecliente.add(cliente);
        if (cliente.getDistribuidor() != this) {
            cliente.setDistribuidor(this);
        }
    }*/
	
	public List getListaDecliente() {
		return listaDecliente;
	}

	public void setListaDecliente(List listaDecliente) {
		this.listaDecliente = listaDecliente;
	}

	

	public int getTipoDeCuenta() {
		return tipoDeCuenta;
	}

	public void setTipoDeCuenta(int tipoDeCuenta) {
		this.tipoDeCuenta = tipoDeCuenta;
	}

	public Distribuidor() {
		// TODO Auto-generated constructor stub
	}

}
