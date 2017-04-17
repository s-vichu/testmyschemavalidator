import com.my.*

class BootStrap {

    def init = { servletContext ->
    	new Person(firstname: "first1").save(failOnError: true)
    }
    def destroy = {
    }
}
