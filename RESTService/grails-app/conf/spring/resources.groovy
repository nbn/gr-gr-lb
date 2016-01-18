import dk.lundogbendsen.rest.City
import grails.rest.render.json.JsonCollectionRenderer
import grails.rest.render.json.JsonRenderer
import grails.rest.render.xml.XmlCollectionRenderer
import grails.rest.render.xml.XmlRenderer

// Place your Spring DSL code here
beans = {
    cityXmlRenderer(XmlRenderer, City) {
        excludes = ['class', 'dateCreated']
    }
    cityJSONRenderer(JsonRenderer, City) {
        excludes = ['class', 'dateCreated']
    }
}
