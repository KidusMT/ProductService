package project.swa.ProductService.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import project.swa.ProductService.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
