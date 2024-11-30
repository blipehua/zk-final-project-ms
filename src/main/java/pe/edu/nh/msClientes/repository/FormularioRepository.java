package pe.edu.nh.msClientes.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.edu.nh.msClientes.model.*;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Integer>  {

	@Query(value = "SELECT * \r\n"
			+ "FROM FORMULARIO \r\n"
			+ "WHERE ID_FORMULARIO = :idFormulario", nativeQuery = true)
	public List<Formulario> getCampos(@Param("idFormulario") int idFormulario);
}
