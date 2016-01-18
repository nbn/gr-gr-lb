import dk.lundogbendsen.rest.City
import dk.lundogbendsen.rest.Kommune

class BootStrap {

    def init = { servletContext ->

        environments {
            development {
                loadData()
            }
            test {
                loadData()
            }
        }
    }
    def destroy = {
    }

    def loadData() {
        new City(postnummer: '2830', bynavn: 'Virum', landekode: 'DK').save(failOnError: true, flush: true)
        new City(postnummer: 'G720GS', bynavn: 'Glasgow', landekode: 'UK').save(failOnError: true, flush: true)

        new Kommune(kommunenummer: '101', kommunenavn: 'København').save(failOnError: true, flush: true)
        new Kommune(kommunenummer: '173', kommunenavn: 'Lyngby-Taarbæk').save(failOnError: true, flush: true)

        println "Loaded test cities, total ${City.count()}"
        println "Loaded test municipals, total ${Kommune.count()}"
    }
}
