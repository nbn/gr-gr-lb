/**
 * Created by Niels Bech Nielsen on 26-12-2015.
 */
class CarShop {

    def cars = [
            new Car(make: 'Ford', model: 'Fiesta', year: 1994),
            new Car(make: 'Opel', model: 'Kadett', year: 1970),
            new Car(make: 'Ford', model: 'Scorpio', year: 2008),
    ]

    def doWithCars(String make, Closure c) {
        cars.findAll { make == it.make }.each {
            c.call(it)
        }
    }

    static void main(String[] args) {
        def cs = new CarShop()
        cs.doWithCars("Ford", { println "Washing $it" })  // Closure er sidste argument
        cs.doWithCars("Opel") { println "Sellgin $it"}    // Og kan skrives uden for parentesen
    }
}
