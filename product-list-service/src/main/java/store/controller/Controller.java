package store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import store.model.ProductItems;
import store.service.Service;

@RestController
public class Controller {
	@Autowired
	public Service serve;
	
	@GetMapping("/getProducts")
	public List<ProductItems> getItems()
	{
		return serve.getItems();
	}
	@PostMapping("/addProducts")
	public void  addProduct(@RequestBody ProductItems prd)
	{
		serve.addProduct(prd);
		
	}
	@GetMapping("/findProduct/{id}")
	public Optional<ProductItems> getProductById(@PathVariable Integer id)
	{
		 return  serve.getProductById(id);
		
	}
	@DeleteMapping("/findProduct/{id}")
	public void removeProduct(@PathVariable Integer id)
	{
		serve.removeProduct(id);
		 
	}

}
