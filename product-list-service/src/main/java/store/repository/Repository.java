package store.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import store.model.ProductItems;

public interface Repository extends MongoRepository<ProductItems, Integer>{

}
