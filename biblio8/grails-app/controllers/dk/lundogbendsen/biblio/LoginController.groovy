package dk.lundogbendsen.biblio

class LoginController {
    static defaultAction = "login"

    def login() {
        def userId = session.userId
        if (userId) {
            log.info "User $userId already existed"
            redirect controller: 'user'
        } else {
            log.info "New user, perform login"
            render view: 'login'
        }
    }

    def doLogin() {
        def id = params.userId
        def pw = params.password

        log.info ("id $id, pw $pw")

        User u = User.findByLoginIdAndPassword(id, pw)
        if (!u) {
            flash.error = "No such username or password"
            redirect action: 'login'
        } else {
            session.userId = u.loginId
            redirect controller: 'user'
        }
    }

    def logout() {
        log.info "User logged out"
        session.invalidate()
        redirect action: 'login'
    }
}
