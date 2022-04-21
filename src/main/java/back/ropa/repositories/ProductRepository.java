package back.ropa.repositories;

import org.springframework.data.repository.CrudRepository;

import back.ropa.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
