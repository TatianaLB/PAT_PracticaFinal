package PAT.proyectoFinal.service;

import PAT.proyectoFinal.model.cancionModel;
import PAT.proyectoFinal.model.usuarioModel;

import java.util.List;

public interface cancionService {

  Iterable<cancionModel> getCancionesService();

  Iterable<cancionModel> getCancionByNombreService();

}
