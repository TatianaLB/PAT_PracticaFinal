package PAT.proyectoFinal.repository;


import PAT.proyectoFinal.model.playlistModel;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public interface playlistRepository extends CrudRepository<playlistModel,String> {





  @Query("SELECT * FROM PLAYLIST WHERE NOMBRE=:nombre")
  Iterable<playlistModel> findPlaylistById(@Param("nombre") String nombre);

}


//DUDAS
//1. Como puedo hacer queries que cojan un input por el metodo que se lo pueda pasar mediante un HTTP request

