package Service;

import Model.Usuarios;
import Repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuariosRepository repo;

    public Usuarios processOAuthPostLogin(String nombreUsuario,String contraseña) {
        Usuarios exisUsuarios= repo.getUserByUsername(nombreUsuario);



        // Aquí puedes implementar la lógica para validar las credenciales de inicio de sesión
        // Utiliza el usuarioRepository para buscar y retornar el usuario si las credenciales son válidas

        return exisUsuarios;
    }

    // Puedes agregar otros métodos relacionados con usuarios aquí
}
