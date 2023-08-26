Select p.titulo AS "Titulo de la pelicula", AVG(c.puntuacion) AS "Calificación promedio"
From peliculas p
         Join calificaciones c on p.id_pelicula = c.id_pelicula
group by p.id_pelicula, p.titulo
order by "calificación promedio" DESC LIMIT 3;
