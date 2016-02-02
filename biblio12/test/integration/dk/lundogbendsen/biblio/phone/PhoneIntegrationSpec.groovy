package dk.lundogbendsen.biblio.phone

import com.google.i18n.phonenumbers.PhoneNumberUtil
import grails.test.spock.IntegrationSpec

/**
 * Created by nielsbechnielsen on 02/02/2016.
 */
class PhoneIntegrationSpec extends IntegrationSpec{

    def phoneUtil

    def "read national numbers"() {
        setup:
        String phonenumber = "26274346"

        when:
        def info = phoneUtil.parse(phonenumber, "DK")
        def type = phoneUtil.getNumberType(info)

        then:
        info.countryCode == 45
        type == PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE

    }

}
