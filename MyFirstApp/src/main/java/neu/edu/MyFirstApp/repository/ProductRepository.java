package neu.edu.MyFirstApp.repository;

import neu.edu.MyFirstApp.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
