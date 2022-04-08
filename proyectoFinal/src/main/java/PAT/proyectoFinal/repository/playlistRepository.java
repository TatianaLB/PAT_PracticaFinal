package PAT.proyectoFinal.repository;


import PAT.proyectoFinal.model.playlistModel;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public interface playlistRepository extends CrudRepository<playlistModel,Integer> {

  @Query("SELECT * FROM PLAYLIST")
  Iterable<playlistModel> getPlaylists();

  @Query("SELECT * FROM PLAYLIST WHERE ID='1'")
  Iterable<playlistModel> findPlaylist();

  @Query("SELECT * FROM PLAYLIST WHERE ID=:id")
  Iterable<playlistModel> findPlaylistById(@Param("id") String id);

}


//DUDAS
//1. Como puedo hacer queries que cojan un input por el metodo que se lo pueda pasar mediante un HTTP request

