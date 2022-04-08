package PAT.proyectoFinal.controller;

import PAT.proyectoFinal.model.playlistModel;
import PAT.proyectoFinal.model.usuarioModel;
import PAT.proyectoFinal.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import PAT.proyectoFinal.service.usuarioService;

import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class UsuarioController {

  @Autowired
  usuarioService usuarioService;

  @GetMapping("/usuarios")
  public ResponseEntity<Iterable<usuarioModel>> getUsuarios(){
    return ResponseEntity.ok().body(usuarioService.getUsuariosService());
  }


  @GetMapping("/usuarioPorNombre/{id}")
  public ResponseEntity<Iterable<usuarioModel>> getPlaylistByName(@PathVariable String id){


    //return ResponseEntity.ok().body(id);

    return ResponseEntity.ok().body(usuarioService.getUsuariosService());
  }
}
