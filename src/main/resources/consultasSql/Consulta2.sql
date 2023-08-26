select g.nombre_genero, count(p.id_pelicula) as numero_peliculas from generos g
left join peliculas p on g.id_genero = p.id_genero
group by  g.nombre_genero
order by numero_peliculas desc;
