package dk.lundogbendsen.biblio

class Review {

    String text
    Date dateCreated = new Date()

    User user

    static belongsTo = [ book: Book ]

    static constraints = {
        text maxSize: 1000, blank: false
    }
}
