package Repository;

import Model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuariosRepository extends JpaRepository<Usuarios,Long> {
    @Query("Select u  From Usuarios u Where u.nombreUsuario = :username")
    public Usuarios getUserByUsername(@Param("username") String username);
    @Query("Select u  From Usuarios u Where u.contraseña = :contraseña")
    public Usuarios getUserByPass(@Param("contraseña") String contraseña);
}
