import geb.spock.GebSpec
import lb.LBKursusPage

/**
 * Created by nielsbechnielsen on 20/01/2016.
 */
class HelloLBSpec extends GebSpec {

    def "Har vi alternative sprog?"() {
        when:
         to LBKursusPage


        then:
        at LBKursusPage // Ikke helt nødvendig da det er implicit i to

        "Alternative sprog på JVM'en" in kursustyper
    }


    def "Er grails kursus på 3 dage?"() {
        given:
        to LBKursusPage

        when:
        def grailskursus = kursus('LB2909')


        then:
        grailskursus
        grailskursus.dage == 3
    }
}
