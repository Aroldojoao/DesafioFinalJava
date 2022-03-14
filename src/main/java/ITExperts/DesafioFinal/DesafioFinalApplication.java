package ITExperts.DesafioFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;


@SpringBootApplication
@RestController


public class DesafioFinalApplication {

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "seiLa", defaultValue = "World") String name,
			@RequestParam(value = "name", defaultValue = "World") String nome) {
	
		ObjectMapper om = new ObjectMapper();
		String ret = "";
		try {
			ret =  om.writeValueAsString(new Object(){ 
				public final String nsei = "faco a menor ideia";
				public final int contador = 90;
				public String name = nome;
			});
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
		
		
		
		
	//return String.format("Hello %s!", name);
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioFinalApplication.class, args);
		
	}

}
