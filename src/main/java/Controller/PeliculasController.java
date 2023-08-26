package Controller;

import Model.Peliculas;
import Service.PeliculasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeliculasController {

    @Autowired
    private PeliculasService peliculaService;

    @GetMapping("/index")
    public List<Peliculas> obtenerTodasLasPeliculas() {
        return peliculaService.obtenerTodasLasPeliculas();
    }

    // Puedes agregar más endpoints relacionados con películas aquí
}
