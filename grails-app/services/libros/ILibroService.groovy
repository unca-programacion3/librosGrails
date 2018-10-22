package libros

interface ILibroService {

    Libro get(Serializable id)

    List<Libro> list(Map args)

    Long count()

    void delete(Serializable id)

    Libro save(Libro libro)

    List<Libro> buscarLibrosPorTitulo(String titulo)

}
