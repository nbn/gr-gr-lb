package dk.lundogbendsen.biblio

class FunTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    static namespace = "fun"


    def toUppercase = { args, body ->
        String theBody = body()
        out << theBody.toUpperCase()
    }

    def toLowercase = { args, body ->
        String theBody = body()
        out << theBody.toLowerCase()
    }

    def toCamelcase = { args, body ->
        String theBody = body()
        String translated = theBody.split().collect { it.capitalize() }.join(" ")
        out << translated

    }
}
