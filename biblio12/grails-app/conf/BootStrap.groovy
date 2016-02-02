import dk.lundogbendsen.biblio.Book
import dk.lundogbendsen.biblio.Profile
import dk.lundogbendsen.biblio.Section
import dk.lundogbendsen.biblio.User

class BootStrap {

    def init = { servletContext ->

        environments {
            development {
                addDefaultBooks()
                addDefaultUser()
            }
            test {
                addDefaultBooks()
                //addDefaultUser()

            }
        }
    }
    def destroy = {
    }

    private void addDefaultBooks() {
        def s = new Section(sectionId: '99-Z', description: 'Computer, Software, Programming, Grails')

        s.addToBooks(new Book(isbn: '1', authors: 'Venkat', title: 'Programming Groovy 2'))
        s.addToBooks(new Book(isbn: '2', authors: 'Glen and Peter', title: 'Grails in Action'))

        s.save(flush: true, failOnError: true)
    }

    private void addDefaultUser() {
        def nbn = new User(loginId: 'nbn', password: 'dontTell')
        def prof = new Profile(bio: 'swell guy', fullname: 'Niels Bech Nielsen', email: 'niels@lundogbendsen.dk')
        nbn.profile = prof

        nbn.save(flush: true, failOnError: true)


    }

}
