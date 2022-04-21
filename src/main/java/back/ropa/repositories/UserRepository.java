package back.ropa.repositories;

import org.springframework.data.repository.CrudRepository;

import back.ropa.models.User;

public interface  UserRepository extends CrudRepository<User, Long>{
    
}
