package pe.edu.nh.msClientes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pe.edu.nh.msClientes.dto.FormularioDTO;
import pe.edu.nh.msClientes.service.FormularioService;

@RestController
@RequestMapping("/v1/formulario")
public class FormularioController {
	
	private final FormularioService formularioService;
	
	public FormularioController(FormularioService fs) {
		this.formularioService = fs;
	}

	@GetMapping("/getDatos")
	public ResponseEntity<List<FormularioDTO>> getFormulario(@RequestParam("idFormulario") int idFormulario){
		List<FormularioDTO> l = this.formularioService.getFormulario(idFormulario);
		return ResponseEntity.ok(l);
	}
	
	@PostMapping
	public ResponseEntity<FormularioDTO> postFormulario(@RequestBody FormularioDTO dto) {
		try {
			FormularioDTO createdDto = formularioService.createFormulario(dto);
			return ResponseEntity.ok(createdDto);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	
}
