package Model;

import jakarta.persistence.*;


@Entity
@Table(name = "calificaciones")
public class Calificaciones {

    @Id
    private Integer id_calificacion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario")
    private Usuarios usuarios;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pelicula")
    private Peliculas peliculas;


    private int puntuacion;

    private String resena;

}
