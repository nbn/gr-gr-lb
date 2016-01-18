package restservice

import dk.lundogbendsen.rest.City
import grails.rest.RestfulController

class CityController extends RestfulController{

    static responseFormats = ['xml','json']

    CityController() {
        super(City)
    }
}
