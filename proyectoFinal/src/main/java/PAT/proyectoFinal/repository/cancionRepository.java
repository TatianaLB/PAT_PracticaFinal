package PAT.proyectoFinal.repository;

import PAT.proyectoFinal.model.cancionModel;
import PAT.proyectoFinal.model.playlistModel;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public interface cancionRepository extends CrudRepository<cancionModel,String> {

  AtomicInteger id = new AtomicInteger();



  @Query("SELECT * FROM CANCION WHERE ID=:id")
  Iterable<cancionModel> getCancionById(String id);

}
