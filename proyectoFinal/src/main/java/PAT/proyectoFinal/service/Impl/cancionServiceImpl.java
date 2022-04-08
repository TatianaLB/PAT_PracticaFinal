package PAT.proyectoFinal.service.Impl;

import PAT.proyectoFinal.model.cancionModel;
import PAT.proyectoFinal.repository.cancionRepository;
import PAT.proyectoFinal.service.cancionService;
import org.springframework.beans.factory.annotation.Autowired;
import PAT.proyectoFinal.repository.cancionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cancionServiceImpl implements cancionService {


  @Autowired
  private cancionRepository cancionRepository;

  @Override
  public Iterable<cancionModel> getCancionesService(){
    return cancionRepository.findAll();
  }

  @Override
  public Iterable<cancionModel> getCancionByIdService(String id){
    return cancionRepository.getCancionById(id);
  }

  @Override
  public void deleteCancionByIdService(String id){
    cancionRepository.deleteById(id);
  }
}
