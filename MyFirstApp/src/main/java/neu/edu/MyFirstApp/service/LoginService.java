package neu.edu.MyFirstApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.MyFirstApp.model.User;
import neu.edu.MyFirstApp.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean authenticate(String username, String password) {
		
		User user = userRepository.findById(username).orElse(null);
		System.out.println(username);
		System.out.println(password);
		System.out.println(user);
		
		if (user!= null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
			return true;
		}else {
			return false;
		}
    }


}
