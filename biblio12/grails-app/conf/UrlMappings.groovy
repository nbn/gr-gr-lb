class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/forside"(controller: 'book', action: 'index')

        // Chapter 12 - Map a single view in
        "/pig"(view: "/pigview")

        "/books/$id?" {
            controller = 'book'
            action = 'show'
        }
        "500"(view:'/error')
        //"404"(view:'/findesIkke')
	}
}
