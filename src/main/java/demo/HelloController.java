package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@EnableAutoConfiguration
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Hellow World from Spring Boot ^^";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloController.class, args);
	}
}
