package configuring

class Person {
	String name
	int age

	static mapping = {
		datasource = 'DEFAULT'
	}
    static constraints = {
    }
}
