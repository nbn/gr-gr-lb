package dk.lundogbendsen.biblio

class TimingFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                request.timestamp = System.currentTimeMillis()

            }
            after = { Map model ->
                request.renderTimestamp = System.currentTimeMillis()
                def time = System.currentTimeMillis() - request.timestamp
                log.debug "Process time $time ms"

            }
            afterView = { Exception e ->
                def alltime = System.currentTimeMillis() - request.timestamp
                def rendertime = System.currentTimeMillis() - request.renderTimestamp
                log.debug "Process time $alltime ms, of which rendering $rendertime ms"

            }
        }
    }
}
