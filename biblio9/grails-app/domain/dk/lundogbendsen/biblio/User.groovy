package dk.lundogbendsen.biblio

class User {
    String loginId
    String password
    Date dateCreated
    Date lastUpdated

    // Relations
    static hasOne = [ profile: Profile ]
    static hasMany = [ borrows: Borrow, reviews: Review,  friends: User ]

    // Constraints
    static constraints = {
        loginId size: 3..20, unique: true, nullable: false
        password size: 6..20, nullable: false, validator: { pass, user ->
            user.loginId != pass

        }
        profile nullable: true

    }

    // Override default mapping
    static mapping = {
        reviews sort: 'dateCreated', order: 'desc'
    }
}
