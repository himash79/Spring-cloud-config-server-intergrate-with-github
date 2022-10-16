package lk.himash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigServerApplication.class, args);
	}

}
