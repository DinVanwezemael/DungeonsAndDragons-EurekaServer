package be.thomasmore.dd.DungeonsAndDragonsEurekaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DungeonsAndDragonsEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DungeonsAndDragonsEurekaServiceApplication.class, args);
	}

}
