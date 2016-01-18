package pig.latin

class PigLatinTagLib {

    static namespace = "pig"
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]


    PigLatinizerService pigLatinizerService

    /**
     * Translate the body into pig-latin.
     * @
     */
    def latinize = { attrs, body ->

        def text = body.call()
        if (!pigLatinizerService)
            out << "null"
        def translated = pigLatinizerService.pigLatinize(text)
        if (!translated)
            out << "not translated text"
        if (text)
            out << translated
    }
}
