package pig.latin

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(PigLatinTagLib)
class PigLatinTagLibSpec extends Specification {


    void "test piglatin"() {
        setup:
        tagLib.pigLatinizerService = new PigLatinizerService()

        when:
        def output = applyTemplate("<pig:latinize>Hello world</pig:latinize>")

        then:
        output == 'elloHay orldway'
    }
}
