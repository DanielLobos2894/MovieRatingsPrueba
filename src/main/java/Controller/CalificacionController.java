package Controller;

import Model.Calificaciones;
import Service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalificacionController {
    @Autowired
    private CalificacionService calificacionService;

    @PostMapping("/calificar-pelicula")
    public ResponseEntity<String> calificarPelicula(@RequestBody Calificaciones calificaciones) {
        // Aquí puedes implementar la lógica para guardar la calificación y reseña
        // Luego, devolver una respuesta adecuada (por ejemplo, un ResponseEntity con un mensaje)
        return null;
    }

    // Puedes agregar más endpoints relacionados con calificaciones aquí
}
