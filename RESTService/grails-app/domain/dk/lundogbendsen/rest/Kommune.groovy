package dk.lundogbendsen.rest

import grails.rest.Resource

@Resource(uri = '/kommuner', formats = ['xml','json'])
class Kommune {

    String kommunenummer
    String kommunenavn
    Date lastUpdated
    Date dateCreated

    static constraints = {
        kommunenummer blank: false, nullable: false
        kommunenavn blank: false, nullable: false
    }
}
