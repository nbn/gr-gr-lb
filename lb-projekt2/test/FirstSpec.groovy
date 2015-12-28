import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll;

class FirstSpec extends Specification {

    def "should return 2 from first element of list"() {

        setup: "Given an empty list"
        def list = []

        when: "An integer is added"
        list << 1

        then: "The value should be at location 0"
        2 == list[0]
    }

    def "should return 1 from first element of list"() {
        setup:
        def list = []
        when:
        list << 1
        then:
        1 == list[0]
    }


    def "one call, one call"() {
        setup:
        List list = Mock()

        when: "Doing nothing"
        then:
        1 * list.size()   // Expect size to be called one times
    }

    def "one call, one good call"() {
        setup:
        List list = Mock()

        when:
        list.size()
        then:
        1 * list.size()   // Expect size to be called one times
    }




    //@Unroll("Does it contain #input")
    def "Does it contain value"() {
        setup:
        def list = [1,2,3,4,5]
        expect:
        list.contains(input) == result

        where:  // Note resultat kan adskilles med ||
        input | result
        1     | false
        2     | true
        3     | true
        4     | true
        5     | true
        6     | false
        0     | false
    }

}