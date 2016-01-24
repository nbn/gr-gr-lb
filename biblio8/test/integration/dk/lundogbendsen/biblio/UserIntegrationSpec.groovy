package dk.lundogbendsen.biblio

import grails.test.spock.IntegrationSpec


class UserIntegrationSpec extends IntegrationSpec {


    void "create basic user"() {
        given:
        def joe = new User(loginId: 'joe', password: 'myjuice')

        when:
        joe.save()

        then:
        !joe.hasErrors()
        joe.id
        User.read(joe.id).loginId == joe.loginId

    }

    void "simple update of user"() {
        given:
        def joe = new User(loginId: 'joe', password: 'myjuice')
        joe.save(failOnError: true)

        when:
        def testJoe = User.get(joe.id)
        testJoe.password = 'AndTheJuice'
        testJoe.save(failOnError: true)

        then:
        User.read(joe.id).password == 'AndTheJuice'
    }

    void "delete of simple user"() {
        given:
        def joe = new User(loginId: 'joe', password: 'myjuice')
        joe.save(failOnError: true)

        when:
        User.get(joe.id).delete(flush: true)

        then:
        !User.exists(joe.id)
    }

    void "Save with invalid properties"() {
        given:
        def joe = new User(loginId: 'joe', password: 'juice')

        when:
        joe.validate()

        then:
        joe.hasErrors()
    }
}
