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

    def doLogin(LoginCommand cmd) {
        log.info ("cmd $cmd")

        if (cmd.hasErrors()) {
            flash.error = 'Error'
            redirect action: 'login'
            return
        }



        User u = User.findByLoginIdAndPassword(cmd.userId, cmd.password)
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

class LoginCommand {
    String userId
    String password

    static constraints = {
        userId nullable: false, blank: false
        password nullable: false, blank: false
    }
}
