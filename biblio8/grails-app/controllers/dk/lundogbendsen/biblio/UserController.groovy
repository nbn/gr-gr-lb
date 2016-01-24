package dk.lundogbendsen.biblio

class UserController {
    static scaffold = true


    /* If I add this action, IDEA will be able to support my GSP better */

    def index() {
        [ userInstanceList: User.list(), userInstanceCount: User.count()]
    }

    def reviews() {
        String id = params.id ?: session.userId
        if (!id) {
            flash.message = 'No ID specified in URL'
            redirect action: 'index'
            return
        }
        User u = User.findByLoginId(id)
        if (!u) {
            flash.message = 'No such user with username $id'
            redirect action: 'index'
            return
        }
        [user : u, reviews: u.reviews, books: Book.list()]
    }

    def newReview() {
        String bookId = params.bookId
        String userId = params.userId
        String review = params.review

        log.info "params = $params"

        if (bookId && userId && review) {
            def user = User.get(userId)
            def book = Book.get(bookId)
            if (user && book && !user.reviews.any { it.book == book }) {
                def nr = new Review(user: user, book: book, text: review)
                if (nr.save()) {
                    flash.message = "Tilføjet nyt review"
                } else {
                    flash.error = "Kunne ikke gemme review"
                }
            } else {
                log.warn "Could not match user (${user.loginId}) with book (${book.isbn})"
                flash.error = "Systemfejl"
            }
            log.info "Filled flash with ${flash}"
            redirect action: 'reviews', id: user.loginId
        } else {
            response.sendError(404)
        }

    }
}
