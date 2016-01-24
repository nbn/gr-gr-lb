package dk.lundogbendsen.biblio

class UserController {
    static scaffold = true


    /* If I add this action, IDEA will be able to support my GSP better */

    def index() {
        [ userInstanceList: User.list(), userInstanceCount: User.count()]
    }
}
