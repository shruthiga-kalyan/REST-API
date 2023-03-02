package dayOne;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestControl1 
{
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World";
	}

}
