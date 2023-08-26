SELECT u.nombreusuario AS "Nombre de usuario", p.titulo AS "Título de la película", c.resena AS "Reseña"
FROM calificaciones c
         JOIN peliculas p ON c.id_pelicula = p.id_pelicula
         JOIN usuarios u ON c.id_usuario = u.id_usuario
WHERE c.id_usuario=1;