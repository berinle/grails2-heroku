package grails2.heroku

class Person {

	String name

    static constraints = {
		name(blank:false)
    }
}
