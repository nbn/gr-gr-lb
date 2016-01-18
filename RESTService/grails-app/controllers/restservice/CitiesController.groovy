package restservice

import dk.lundogbendsen.rest.City
import grails.converters.JSON
import grails.converters.XML

class CitiesController {

    def index() {
        def list = City.list()

        withFormat {
            html   cities: list
            xml { render list as XML}
            json { render list as JSON}
        }

    }
}
