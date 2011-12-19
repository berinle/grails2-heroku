package grails2.heroku

class Book {
	String title
	String toString() { title }
	
	static belongsTo = [author: Author]
	
	static mapping = {
		cache true
	}
	
    static constraints = {
		title blank:false
    }
}
