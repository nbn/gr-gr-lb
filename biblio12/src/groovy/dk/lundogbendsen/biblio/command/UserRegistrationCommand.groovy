package dk.lundogbendsen.biblio.command

import dk.lundogbendsen.biblio.Profile
import dk.lundogbendsen.biblio.User
import grails.validation.Validateable
import groovy.transform.ToString

/**
 * Created by nielsbechnielsen on 24/01/2016.
 */
@Validateable
@ToString
class UserRegistrationCommand {

    String loginId
    String password
    String repeatPassword
    String fullname
    String bio
    String email

    static constraints =  {
        importFrom User
        importFrom Profile


            repeatPassword nullable: false, validator: { repeat, urc ->
                return repeat == urc.password
            }

        }
}
