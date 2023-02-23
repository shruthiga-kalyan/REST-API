package dayOne;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TestControl2
{
	@RequestMapping(value="/name/{name}",method=RequestMethod.GET)
	public String getValue(@PathVariable String name)	
	{	
		return "Welcome "+name+"!";
		
	}
	
}
