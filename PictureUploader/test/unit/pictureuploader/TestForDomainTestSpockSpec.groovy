package pictureuploader

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification
/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class TestForDomainTestSpockSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def tester(){
		given: "franchement c'est nul"
		def vilain = new DomainForTestSpock()
		
		vilain.setNom("le groovy")
		vilain.setPrenom("�a marche pas")
		vilain.setAge(666)
				
		expect: "c'est vraiment nul !!"
		
		vilain.ToString() == "le groovy �a marche pas 666"
	}
}
