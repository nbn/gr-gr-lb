package dk.lundogbendsen.geb

class Person {

    boolean enabled

    String firstName
    String lastName


    static constraints = {
        firstName blank: false, nullable: false
        lastName blank: false, nullable: false

        enabled()
    }
}
