package dk.lundogbendsen.biblio.phone

import com.google.i18n.phonenumbers.PhoneNumberUtil
import spock.lang.Specification

/**
 * Created by nielsbechnielsen on 02/02/2016.
 */
class PhoneSpec extends Specification{

    def "read national numbers"() {
        setup:
        String phonenumber = "26274346"
        def phoneUtil = PhoneNumberUtil.getInstance()

        when:
        def info = phoneUtil.parse(phonenumber, "DK")
        def type = phoneUtil.getNumberType(info)

        then:
        info.countryCode == 45
        type == PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE

    }
}
