package PAT.proyectoFinal.repository;


import PAT.proyectoFinal.model.usuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface usuarioRepository extends CrudRepository<usuarioModel,String> {



  @Query("SELECT * FROM USUARIO WHERE USERNAME=:id")
  Iterable<usuarioModel> getUsuarioById(@Param("id") String id);
}
