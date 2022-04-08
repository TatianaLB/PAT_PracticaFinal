package PAT.proyectoFinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table("PLAYLIST")
public class playlistModel {
  //@GeneratedValue(strategy = GenerationType.AUTO)
  private @Column("ID") @Id
  String id;
  private @Column("NOMBRE")
  String nombre;
  private @Column("NUMERO_CANCIONES")
  String numeroCanciones;
}
