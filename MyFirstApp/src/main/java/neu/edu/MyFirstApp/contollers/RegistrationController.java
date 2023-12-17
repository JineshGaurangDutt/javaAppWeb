package neu.edu.MyFirstApp.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import neu.edu.MyFirstApp.model.User;
import neu.edu.MyFirstApp.service.UserService;

@Controller
public class RegistrationController {

	@Autowired
	private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(User user) {
    	System.out.println(user);
    	userService.save(user);
        return "redirect:/login";
    }
}

