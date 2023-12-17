package neu.edu.MyFirstApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import neu.edu.MyFirstApp.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	

}
