package dk.lundogbendsen.rest

class City {

    Date lastUpdated
    Date dateCreated

    String postnummer
    String bynavn
    String landekode


    static constraints = {
        postnummer blank: false, nullable: false
        bynavn blank: false, nullable: false
        landekode minSize: 2, maxSize: 3, blank: false, nullable: false, matches: "[A-Z]+"
    }
}
