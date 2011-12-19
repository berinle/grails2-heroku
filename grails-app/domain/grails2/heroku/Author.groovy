package grails2.heroku

class Author {

	String name
	String toString(){ name }
	
	static hasmany = [books: Book]
	
    static constraints = {
		name blank:false
    }
	
	static mapping = {
		cache true
	}
}
