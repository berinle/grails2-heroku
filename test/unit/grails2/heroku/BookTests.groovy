package grails2.heroku



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
@Mock(Author)
class BookTests {

    void testSomething() {
		def author = new Author(name:'Some Author').save()
       def book = new Book(title:'Lawyers', author:author).save()
	   assert Book.count() == 1
    }
}
