package grails2.heroku



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonTests {

    void testSomething() {
		def person = new Person(name:"bayo")
		person.save()
		assert Person.list().size() == 1
    }
}
