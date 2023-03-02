package dayOne;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController	
public class TestController3 
{
		@RequestMapping(value="/color/{color}",method=RequestMethod.GET)
		public String myFavColor(@PathVariable String color)	
		{	
			return "My favorite color is "+color;
			
		}
		
}


