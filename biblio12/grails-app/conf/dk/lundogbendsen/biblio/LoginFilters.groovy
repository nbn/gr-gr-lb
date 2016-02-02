package dk.lundogbendsen.biblio

class LoginFilters {

    def filters = {
        all(controllerExclude:'login', action:'*') {
            before = {
                def id = session.userId
                if (controllerName && !id) {
                    redirect controller: 'login', action: 'login'
                    return false
                }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
