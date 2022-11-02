package comic.one.gateway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.gateway.filter.factory.TokenRelayGatewayFilterFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class BestComicGatewayApplication {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private TokenRelayGatewayFilterFactory filterFactory;

	public static void main(String[] args) {
		SpringApplication.run(BestComicGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder routeBuilder) {
		return routeBuilder.routes().route("comic-one-client", r -> {
			return r.path("/client/v1")
					.filters(f -> f.filters(filterFactory.apply())
							.removeRequestHeader("Cookie"))
					.uri(serviceUrl());
		}).build();
	}

	public String serviceUrl() {
		List<ServiceInstance> list = discoveryClient.getInstances("comic-one-client");
		if (list != null && list.size() > 0) {
			System.out.print(list.get(0).getUri().toString());
			return list.get(0).getUri().toString();
		}
		return null;
	}
}
