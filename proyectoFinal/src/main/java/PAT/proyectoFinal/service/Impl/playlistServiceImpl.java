package PAT.proyectoFinal.service.Impl;

import PAT.proyectoFinal.model.playlistModel;
import PAT.proyectoFinal.repository.playlistRepository;
import PAT.proyectoFinal.service.playlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import PAT.proyectoFinal.repository.playlistRepository;

import java.util.List;

@Service
public class playlistServiceImpl implements playlistService {

  @Autowired
  playlistRepository playlistRepository;


  @Override
  public List<playlistModel> getPlaylistsService(){
    return playlistRepository.getPlaylists();
  }

  @Override
  public List<playlistModel> getPlaylistByNombreService(String nombre){

    return playlistRepository.findPlaylistByName(nombre);
  }

}
