package comic.one.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan(basePackages = {"comic.one.entities"}) 
public class BestComicClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestComicClientServerApplication.class, args);
	}
}
