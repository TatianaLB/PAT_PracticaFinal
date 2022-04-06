package PAT.proyectoFinal.service;

import PAT.proyectoFinal.model.playlistModel;

import java.util.List;

public interface playlistService {

  List<playlistModel> getPlaylistsService();

  List<playlistModel> getPlaylistByNombreService(String name);
}
