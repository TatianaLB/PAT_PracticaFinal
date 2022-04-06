package PAT.proyectoFinal.repository;

import PAT.proyectoFinal.model.cancionModel;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public interface cancionRepository extends CrudRepository<cancionModel,Integer> {

  AtomicInteger id = new AtomicInteger();

  @Query("SELECT * FROM CANCION")
  List<cancionModel> getCanciones();


}
