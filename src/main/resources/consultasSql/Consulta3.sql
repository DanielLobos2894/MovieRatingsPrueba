select p.titulo as pelicula, avg(c.puntuacion) as promedio
from peliculas p
inner join calificaciones c on p.id_pelicula = c.id_pelicula where p.id_pelicula = 1;