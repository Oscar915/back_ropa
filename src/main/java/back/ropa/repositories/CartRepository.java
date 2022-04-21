package back.ropa.repositories;

import org.springframework.data.repository.CrudRepository;

import back.ropa.models.Cart;

public interface CartRepository extends CrudRepository<Cart, Long>{
    
}
