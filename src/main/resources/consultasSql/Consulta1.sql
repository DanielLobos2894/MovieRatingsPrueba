select peliculas.titulo As Titulo, peliculas.anio_lanzamiento as Año_Lanzamiento, generos.nombre_genero as genero
from peliculas
         join generos on peliculas.id_genero = generos.id_genero
order by peliculas.anio_lanzamiento asc;