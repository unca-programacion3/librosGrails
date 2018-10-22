package libros

import grails.gorm.services.Service

@Service(Libro)
abstract class LibroService implements ILibroService{

    @Override
    def List<Libro> buscarLibrosPorTitulo(String titulo) {
          titulo='%'+titulo+'%'
          return Libro.findAllByTituloLike(titulo)
    }
}
