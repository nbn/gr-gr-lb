package dk.lundogbendsen.biblio

class UserController {
    static scaffold = true

    def reviewService
    def failureService


    /* If I add this action, IDEA will be able to support my GSP better */

    def index() {
        [ userInstanceList: User.list(), userInstanceCount: User.count()]
    }

    def failure() {
        log.info "About to generate failure"
        failureService.fejlEfterSkrivning()
        log.info "Failure generated. Going to index"
        redirect action: 'index'
    }

    def reviews() {
        String id = params.id ?: session.userId
        log.info "Reviews for id = $id"
        if (!id) {
            flash.message = 'No ID specified in URL'
            redirect action: 'index'
            return
        }
        User u = User.findByLoginId(id) ?: User.findById(id)
        if (!u) {
            flash.message = 'No such user with username $id'
            redirect action: 'index'
            return
        }
        [user : u, reviews: u.reviews, books: Book.list()]
    }

    def newReview() {
        log.info "params = $params"

        def result = reviewService.opretReview(params.userId, params.bookId, params.review)

        switch (result) {
            case ReviewService.OpretReviewResultat.OK:
               flash.message = "Review er oprettet, tak for det"
                break
            case ReviewService.OpretReviewResultat.VALIDERINGS_FEJL:
                flash.error = "Fejl under oprettelse af review"
                break
            case ReviewService.OpretReviewResultat.HAR_REVIEWET:
                flash.error = "Har allerede reviewet bogen."
                break
        }
        redirect action: 'reviews', id: params.userId

    }
}
