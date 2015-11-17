package configuring
import org.springframework.beans.factory.annotation.Value
class Inject_propController {
	@Value('${app.data}')
	String data
    
    def index() { 
    	render "Hello ${data}"
    }
}
