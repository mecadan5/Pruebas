package modelo;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="cupo")
public class Cupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	
	Long id;
	Long cupo_asignado;
	Long sobre_cupo_asignado;
	Long cupo_total;
	Long cupo_consumido;
	Long idusuario;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCupo_asignado() {
		return cupo_asignado;
	}
	public void setCupo_asignado(Long cupo_asignado) {
		this.cupo_asignado = cupo_asignado;
	}
	public Long getSobre_cupo_asignado() {
		return sobre_cupo_asignado;
	}
	public void setSobre_cupo_asignado(Long sobre_cupo_asignado) {
		this.sobre_cupo_asignado = sobre_cupo_asignado;
	}
	public Long getCupo_total() {
		return cupo_total;
	}
	public void setCupo_total(Long cupo_total) {
		this.cupo_total = cupo_total;
	}
	public Long getCupo_consumido() {
		return cupo_consumido;
	}
	public void setCupo_consumido(Long cupo_consumido) {
		this.cupo_consumido = cupo_consumido;
	}
	
	
	
	
}
