package PAT.proyectoFinal.controller;

import PAT.proyectoFinal.model.cancionModel;
import PAT.proyectoFinal.model.playlistModel;
import PAT.proyectoFinal.service.cancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import PAT.proyectoFinal.service.cancionService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class CancionController {

  @Autowired
  cancionService cancionService;


  @GetMapping("/canciones")
  public ResponseEntity<Iterable<cancionModel>> getCanciones(){
    return ResponseEntity.ok().body(cancionService.getCancionesService());
  }

  @GetMapping("/cancion/{id}")
  public ResponseEntity<Iterable<cancionModel>> getPlaylistByName(@PathVariable String id){


    //return ResponseEntity.ok().body(id);

    return ResponseEntity.ok().body(cancionService.getCancionByIdService(id));
  }

  @GetMapping("/cancion/delete/{id}")
  public ResponseEntity<Void> deletePlaylistById(@PathVariable String id){
    cancionService.deleteCancionByIdService(id);
    return ResponseEntity.ok().build();
  }
}
