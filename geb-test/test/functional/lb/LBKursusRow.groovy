package lb

import geb.Module

/**
 * Created by nielsbechnielsen on 20/01/2016.
 */
class LBKursusRow extends Module{
    static content = {
        nummer { $("td", 0).text() }
        dage   { $("td", 1).text() as int }
        navn   { $("td", 2).text() }
        pris   { $("td", 3).text() }
        dato   { $("td", 4).text() }
    }
}
