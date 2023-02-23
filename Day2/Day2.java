package dayTwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2 {


		
		@Value("${name}")
		private String name;
		
		@GetMapping("/name")
		public String greet()
		{
			return "Hello "+name;
		}

}