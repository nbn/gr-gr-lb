package dk.lundogbendsen.biblio

class Borrow {
    Date dateBorrowed
    Date dateReturned
    User user
    Book book

    static constraints = {
        dateBorrowed nullable: false
        dateReturned nullable: true
    }

    def isOpen() {
        return !dateReturned
    }
}
