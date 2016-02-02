package dk.lundogbendsen.biblio

class Profile {
    User user
    byte [] photo
    String fullname
    String bio
    String email

    static belongsTo = User

    static constraints = {
        fullname blank: false
        email email: true, blank: false
        photo nullable: true, maxSize: 2 * 1024 * 1024 // 2Mb
        bio maxSize: 1000, nullable: true
    }
}
