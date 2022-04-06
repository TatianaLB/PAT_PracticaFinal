package PAT.proyectoFinal.repository;


import PAT.proyectoFinal.model.playlistModel;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public interface playlistRepository extends CrudRepository<playlistModel,Integer> {

  @Query("SELECT * FROM PLAYLIST")
  List<playlistModel> getPlaylists();

  @Query(value = "SELECT p FROM PLAYLIST WHERE p.nombre LIKE %?1%")
  List<playlistModel> findPlaylistByName(String nombre);
}
