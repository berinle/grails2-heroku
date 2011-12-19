package grails2.heroku



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Author)
class AuthorTests {

    void testSomething() {
		def author = new Author(name:'John Grisham').save()
		assert Author.count() == 1
    }
}
