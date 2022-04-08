package PAT.proyectoFinal.repository;


import PAT.proyectoFinal.model.usuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jdbc.repository.query.Query;

import java.util.List;


public interface usuarioRepository extends CrudRepository<usuarioModel,String> {

  @Query("SELECT * FROM USUARIO")
  Iterable<usuarioModel> getUsuarios();
}
