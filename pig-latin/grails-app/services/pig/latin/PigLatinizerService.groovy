package pig.latin

import grails.transaction.Transactional

@Transactional
class PigLatinizerService {

    def pigLatinize(String sentense) {
        def words = sentense.split()
        return words.collect { pigLatinizePartialWord(it)}.join(' ')
    }

    def pigLatinizePartialWord(String word) {
        def realWordMatcher = ( word =~ /(\w+)\W.*/ )
        if (realWordMatcher.matches()) {
            def realWord = realWordMatcher[0][1]
            def translated = pigLatinizeWord(realWord)
            return word.replace(realWord, translated)
        } else {
            return pigLatinizeWord(word)
        }
    }

    def pigLatinizeWord(String word) {
        def upper = word[0].toLowerCase() != word[0]
        if (isVowel(word[0])) {
            return word + "way"
        }
        else {
            def pos = firstVowel(word)
            def replacement = word[pos..-1] + word[0..<pos] + "ay"
            return upper ? replacement.toLowerCase().capitalize() : replacement
        }
    }

    private def firstVowel(String word) {
        for (int i in 0..<word.size()) {
            if (isVowel(word[i])) {
                return i
            }
        }
        return -1
    }
    private boolean isVowel(String ch) {
        return ch.toLowerCase() in "a e i o u y æ ø å".split()
    }
}
