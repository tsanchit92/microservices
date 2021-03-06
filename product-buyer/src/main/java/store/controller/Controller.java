package store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import store.model.ProductItems;

@RestController
public class Controller {

	@Autowired
	private WebClient.Builder webClientBuilder;

	@GetMapping("/getProducts")
	public List<ProductItems> getProducts() {
		
		List<ProductItems> response = webClientBuilder.build()
				.get()
				.uri("http://product-list/getProducts")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve().bodyToMono(new ParameterizedTypeReference<List<ProductItems>>() {})
				 .block();

		
		return response;

	}

}
