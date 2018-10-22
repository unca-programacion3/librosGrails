package libros

class Libro {
    String titulo
    String editorial
    Integer publicacion
    String resumen
    String foto
    Autor autor

    static constraints = {
    	titulo(unique: ['publicacion'] )
    	publicacion(min: 1900, validator: { val, obj ->
    	   int year = Calendar.getInstance().get(Calendar.YEAR)
    	   if (val> year) {return ['publicacionIncorrecta',year]}
    	})
    	foto()
      resumen(blank:true, nullable: true)
    }
}
