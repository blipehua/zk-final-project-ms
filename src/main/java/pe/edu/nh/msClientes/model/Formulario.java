package pe.edu.nh.msClientes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Formulario")
@Getter
@Setter
@ToString
public class Formulario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDetFormulario;
	private int idFormulario;
	private String label;
	private String tipo;
	private String valor;	
}
