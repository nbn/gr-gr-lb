class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/test-pig-latin"(view: '/test-piglatin')

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
