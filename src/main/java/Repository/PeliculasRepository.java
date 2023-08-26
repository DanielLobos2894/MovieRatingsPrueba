package Repository;

import Model.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculasRepository extends JpaRepository<Peliculas,Integer> {
}
