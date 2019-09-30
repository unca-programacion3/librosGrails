package libros

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"libro", action:"index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
