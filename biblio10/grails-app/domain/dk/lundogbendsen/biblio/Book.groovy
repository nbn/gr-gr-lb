package dk.lundogbendsen.biblio

class Book {

    String isbn
    String title
    String authors
    String description
    Date publishDate = new Date()

    static hasMany = [ reviews: Review]

    static belongsTo = [ section: Section]

    static constraints = {
        isbn nullable: false, matches: /\d+/
        title nullable: false, blank: false
        authors nullable: false, blank: false
        description nullable: true, maxSize: 1000

    }
}
