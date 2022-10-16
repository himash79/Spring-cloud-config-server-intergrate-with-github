package lk.himash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class config {

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
}
