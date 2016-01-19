import geb.spock.GebReportingSpec

import spock.lang.*

import pages.*

@Stepwise
class PersonCRUDSpec extends GebReportingSpec {

    def "there are no people"() {
        when:
        to ListPage
        then:
        personRows.size() == 0
    }

    def "add a person"() {
        when:
        newPersonButton.click()
        then:
        at CreatePage
    }

    def "enter the details"() {
        when:
        $("#enabled").click()
        firstName = "Niels Bech"
        lastName = "Nielsen"
        createButton.click()
        then:
        at ShowPage
    }

    def "check the entered details"() {
        expect:
        firstName == "Niels Bech"
        lastName == "Nielsen"
        enabled == true
    }

    def "edit the details"() {
        when:
        editButton.click()
        then:
        at EditPage
        when:
        $("#enabled").click()
        updateButton.click()
        then:
        at ShowPage
    }

    def "check in listing"() {
        when:
        to ListPage
        then:
        personRows.size() == 1
        def row = personRow(0)
        row.firstName == "Niels Bech"
        row.lastName == "Nielsen"
    }

    def "show person"() {
        when:
        personRow(0).showLink.click()
        then:
        at ShowPage
    }

    def "delete user"() {
        given:
        def deletedId = id
        when:
        withConfirm { deleteButton.click() }
        then:
        at ListPage
        message == "Person $deletedId deleted"
        personRows.size() == 0
    }
}