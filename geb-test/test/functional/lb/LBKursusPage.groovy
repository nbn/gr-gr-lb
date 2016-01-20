package lb

import geb.Page

/**
 * Created by nielsbechnielsen on 20/01/2016.
 */
class LBKursusPage extends Page{

    static url = "http://www.lundogbendsen.dk/undervisning/aabne_kurser"

    static at = {
        title == 'JAVA-kurser'
    }

    static content = {
        kursustyper { $("h2")*.text() }

        // Udvidet
        kursus { module LBKursusRow, kursusrow(it) }
        kursusrow {
            $("tr").has("td", text: it)
        }
    }
}
