package twitterassign01

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Account)
@Mock([Account])
@Unroll
class AccountSpec extends Specification {

    def setup() {


    }

    def "Test required fields to ensure that constraints are enforced"() {
        // def obj= new Account(userHandle:"",fullName:"",emailAddr:"",accPassword:"").save()
        when:

        def obj = new Account("field": val)

        then:

        validateConstraints(obj, field, error)

        where:
        error            | field         | val
        'nulluserHandle' | 'userHandle'  | ''
        'nulluserHandle' | 'fullName'    | ''
        'nulluserHandle' | 'emailAddr'   | ''
        'nulluserHandle' | 'accPassword' | ''

    }


    def cleanup() {
    }

    void "test something"() {
        expect: "fix me"
        true == false
    }
}
