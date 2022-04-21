package back.ropa.repositories;

import org.springframework.data.repository.CrudRepository;

import back.ropa.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
    
}
