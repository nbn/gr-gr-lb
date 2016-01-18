package pig.latin

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(PigLatinizerService)
class PigLatinizerServiceSpec extends Specification {


    @Unroll
    void "test pig-latinizer #name"() {
        expect:
        service.pigLatinizeWord(input) == output

        where:
        input   || output
        'egg'   || 'eggway'
        'duck'  || 'uckday'
        'fruit' || 'uitfray'
    }

    void "test pig-latinizer sentence"() {
        expect:
        service.pigLatinize("hello world") == "ellohay orldway"
    }

    void "test uppercase"() {
        expect:
        service.pigLatinize("Hello world") == "Ellohay orldway"
    }

    void "testPunctuation"() {
        expect:
        service.pigLatinize("Hello world.") == "Ellohay orldway."
    }
}
