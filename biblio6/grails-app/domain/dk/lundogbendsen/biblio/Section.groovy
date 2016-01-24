package dk.lundogbendsen.biblio

class Section {

    String sectionId
    String description

    static hasMany = [ books:Book ]

    static constraints = {
        description maxSize: 1000
    }
}
