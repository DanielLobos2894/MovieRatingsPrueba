package Modelo;

import jakarta.persistence.*;

@Entity
public class Generos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_genero", nullable = false)
    private int id;

    @Column(name = "nombre_genero")
    private String nombre_genero;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_genero() {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }
}
