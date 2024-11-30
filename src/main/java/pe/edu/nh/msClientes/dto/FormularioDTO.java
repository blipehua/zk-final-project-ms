package pe.edu.nh.msClientes.dto;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FormularioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idFormulario;
	private String label;
	private String tipo;
	private Object valor;
	
	public FormularioDTO() {
	}
	
	public FormularioDTO(String label, String tipo){//, Object value) {
		this.label = label;
		this.tipo = tipo;
		//this.value = value;
	}
	
	public FormularioDTO(String label, String tipo, Object valor) {
		this.label = label;
		this.tipo = tipo;
		this.valor = valor;
	}

	public FormularioDTO(int idFormulario, String label, String tipo, Object valor) {
		super();
		this.idFormulario = idFormulario;
		this.label = label;
		this.tipo = tipo;
		this.valor = valor;
	}
}

