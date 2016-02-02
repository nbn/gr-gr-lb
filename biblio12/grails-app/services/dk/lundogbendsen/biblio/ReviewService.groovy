package dk.lundogbendsen.biblio

import grails.transaction.Transactional

@Transactional
class ReviewService {

    enum OpretReviewResultat {
        OK, VALIDERINGS_FEJL, HAR_REVIEWET
    }

    OpretReviewResultat  opretReview(String userId, String bookId, String reviewText) {
        def user = User.get(userId)
        def book = Book.get(bookId)


        if (user && user.reviews.any { it.book == book}) {
            return OpretReviewResultat.HAR_REVIEWET
        }
        def nr = new Review(user: user, book: book, text: reviewText)
        if (nr.validate()) {
            nr.save()
            return OpretReviewResultat.OK
        } else {
            return OpretReviewResultat.VALIDERINGS_FEJL
        }


    }
}
