package store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import store.model.ProductItems;
import store.repository.Repository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	public Repository repo;
	

	public List<ProductItems> getItems()
	{
		return repo.findAll();
	}

	public String addProduct(ProductItems prd)
	{
		repo.save(prd);
		return "Suucessfully added the product wiht id:"+" "+prd.getId();
	}
	
	public Optional<ProductItems> getProductById(Integer id)
	{
		 return  repo.findById(id);
		
	}
	
	public void removeProduct(Integer id)
	{
		 repo.deleteById(id);
		 
	}
	


}
