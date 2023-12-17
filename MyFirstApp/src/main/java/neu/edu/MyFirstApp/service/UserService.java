package neu.edu.MyFirstApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.MyFirstApp.model.User;
import neu.edu.MyFirstApp.repository.UserRepository;

@Service
public class UserService {
	
	 private final UserRepository userRepository;

	    @Autowired
	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<User> getAllExamples() {
	        return userRepository.findAll();
	    }

	    public User getExampleById(String id) {
	        return userRepository.findById(id).orElse(null);
	    }

		public void save(User user) {
	        userRepository.save(user);
		}
	

}


