package Service;

import Model.Peliculas;
import Repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculasService {
    @Autowired
    private PeliculasRepository peliculaRepository;

    public List<Peliculas> obtenerTodasLasPeliculas() {
        return peliculaRepository.findAll();
    }

    // Puedes agregar otros métodos relacionados con películas aquí
}
