package PAT.proyectoFinal.controller;

import PAT.proyectoFinal.model.playlistModel;
import PAT.proyectoFinal.service.playlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import PAT.proyectoFinal.service.playlistService;

import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class PlaylistController {

  @Autowired
  playlistService playlistService;


  @GetMapping("/playlists")
  public ResponseEntity<Iterable<playlistModel>> getPlaylists(){

    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.set("Result", "OK");
    System.out.println(responseHeaders);
    return new ResponseEntity<Iterable<playlistModel>>(playlistService.getPlaylistsService(),responseHeaders, HttpStatus.OK);

    //return ResponseEntity.ok().body(playlistService.getPlaylistsService());
  }

  //LOS TRES DE ARRIBA FUNCIONAN BIEN.

  //NO ESTA TERMINADO
  @GetMapping("/playlistPorNombre/{id}")
  public ResponseEntity<Iterable<playlistModel>> getPlaylistByName(@PathVariable String id){


    //return ResponseEntity.ok().body(id);

    return ResponseEntity.ok().body(playlistService.getPlaylistByIdService(id));
  }
}
