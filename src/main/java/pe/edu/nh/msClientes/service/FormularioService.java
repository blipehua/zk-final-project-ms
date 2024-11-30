package pe.edu.nh.msClientes.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import pe.edu.nh.msClientes.dto.FormularioDTO;
import pe.edu.nh.msClientes.model.Formulario;
import pe.edu.nh.msClientes.repository.FormularioRepository;

@Service
public class FormularioService {
	private final FormularioRepository formularioRepository;
	private final ModelMapper modelMapper;
	
	public FormularioService(FormularioRepository formularioRepository, ModelMapper modelMapper) {
		this.formularioRepository = formularioRepository;
		this.modelMapper = modelMapper;
	}
	
	public List<FormularioDTO> getFormulario(int idFormulario) {
		List<FormularioDTO> listaDTO = new ArrayList<FormularioDTO>();
		List<Formulario> lista = this.formularioRepository.getCampos(idFormulario);
		for(Formulario f : lista) {
			FormularioDTO fDTO = new FormularioDTO(f.getLabel(), f.getTipo(), f.getValor());
			listaDTO.add( fDTO );
		}		
		return listaDTO;		
	}
	
	public FormularioDTO createFormulario(FormularioDTO dto) {
		System.out.println("Creando formulario ...");
		Formulario formulario = modelMapper.map(dto, Formulario.class);
		FormularioDTO formularioDTO = modelMapper.map(formularioRepository.save(formulario), FormularioDTO.class);
		System.out.println("Formulario creado...");
		
		return formularioDTO;
	}
}
