import geb.spock.GebSpec

/**
 * Created by nielsbechnielsen on 20/01/2016.
 */
class HelloWorldSpec extends GebSpec {

    def "er vi alternative?"() {
        when:
         go "http://www.lundogbendsen.dk/undervisning/aabne_kurser"



        then:
        title == 'JAVA-kurser'

        "Alternative sprog på JVM'en" in $("h2")*.text()
    }
}
