package dk.lundogbendsen.biblio

import grails.transaction.Transactional

@Transactional
class FailureService {


    def fejlEfterSkrivning() {
        def u = new User(loginId: 'abc', password: 'abcdefghij', profile: new Profile(fullname: 'Anders B Christensen', email: 'abc@def.dk', bio: 'Swell guy'))

        u.save(flush:true, failOnError: true)

        throw new RuntimeException("Index out of bounds")


    }
}
