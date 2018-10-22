package libros
import libros.Autor
import libros.Libro

class BootStrap {

    def init = { servletContext ->
      /*def autor1 = new Autor(apellidoNombre:"GIULIO ZAMBON").save(flush:true)
      def resumen = "Interactivity is what makes the Web really useful...."
      new Libro(titulo: "BEGINNING JSP, JSF AND TOMCAT",
            editorial: "SPRINGER SCIENCE + BUSINESS MEDIA NEW YORK",
            publicacion: 2012, resumen: resumen, foto: "http://www.misitio.com/images/librojsp.png",
            autor: autor1).save(flush:true)*/
    }
    def destroy = {
    }
}
