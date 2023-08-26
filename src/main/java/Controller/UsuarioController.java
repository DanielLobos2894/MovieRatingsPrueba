package Controller;

import Model.Usuarios;
import Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public Usuarios login(@RequestBody Usuarios usuarios) {
        return usuarioService.processOAuthPostLogin(usuarios.getNombreUsuario(), usuarios.getContraseña());
    }

    // Puedes agregar más endpoints relacionados con usuarios aquí
}
