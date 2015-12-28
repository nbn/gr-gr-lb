import spock.lang.Specification

/**
 * Created by Niels Bech Nielsen on 22-12-2015.
 */
class StockOrderSpec extends Specification{

    // Hver metode får sin egen instans, ligesom i setup()
    // Kan deles med @Shared
    String ms = 'MICROSOFT'

    // setup()  - @Before
    // cleanup() - @After
    // setupSpec() - @BeforeClass
    // cleanupSpec() - @AfterClass

    // annotations
    // @Timeout(secs)
    // @Ignore
    // @Unroll(string with #interpolation)

    def "ny stock order uden data"() {

        // Provide a set of blocks..
        // setup:  test specific setup (alias given)
        // when: stimulus
        // and: placeholder for readability
        // then: response (conditions, exception conditions, interactions)
        // expect: when and then merged into a single expression
        // where: data til context
        // cleanup: test specific cleanup

        // outside of then (and expect) you can use assert..

        when:
         def so = new StockOrder(verb: 'sell', share: ms)

        then:
        so.toString() == 'selling MICOSOFT immediately'

    }
}
