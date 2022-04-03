package store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
/* @EnableSwagger2 */
public class ProductBuyerApplication {
	@LoadBalanced 
	
	@Bean
	public WebClient.Builder getWebClientBuilder()
	{
		return  WebClient.builder();
	}
	/*
	 * @Bean public Docket swaggerConfiguration() { return new
	 * Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*"
	 * )).apis(RequestHandlerSelectors.basePackage("store")).build();
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(ProductBuyerApplication.class, args);
	}

}
