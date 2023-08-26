package Service;

import Repository.CalificacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalificacionService {
    @Autowired
    private CalificacionesRepository calificacionRepository;

    // Aquí puedes implementar métodos para guardar y recuperar calificaciones y reseñas
}

