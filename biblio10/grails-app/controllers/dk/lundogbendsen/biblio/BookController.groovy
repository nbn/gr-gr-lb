package dk.lundogbendsen.biblio

class BookController {

    def index() {


        [ sections: Section.list() ]

    }

    def show() {
        String id = params.id
        if (!id) {
            flash.message = 'No ID specified in URL'
            redirect action: 'index'
            return
        }
        Book b = Book.findByIsbn(id)
        if (!b) {
            flash.message = 'No such book with ISBN $id'
            redirect action: 'index'
            return
        }
        [book: b, reviews: b.reviews]

    }
}
