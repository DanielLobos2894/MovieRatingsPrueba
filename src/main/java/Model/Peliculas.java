package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "peliculas")
public class Peliculas {
    @Id
    private int id_pelicula;
    private String titulo;
    private int ano_lanzamiento;

    //id genero 1 a mucho

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Generos generos;


    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno_lanzamiento() {
        return ano_lanzamiento;
    }

    public void setAno_lanzamiento(int ano_lanzamiento) {
        this.ano_lanzamiento = ano_lanzamiento;
    }

}
