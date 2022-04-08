package PAT.proyectoFinal.service.Impl;

import PAT.proyectoFinal.model.usuarioModel;
import PAT.proyectoFinal.repository.usuarioRepository;
import PAT.proyectoFinal.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuarioServiceImpl implements usuarioService {

  @Autowired
  private usuarioRepository usuarioRepository;


  @Override
  public Iterable<usuarioModel> getUsuariosService(){
    return usuarioRepository.findAll();
  }

  @Override
  public Iterable<usuarioModel> getUsuarioByIdService(String id){

    return usuarioRepository.getUsuarioById(id);
  }

  @Override
  public void deleteUsuarioByIdService(String id){
    usuarioRepository.deleteById(id);
  }
}
