package neu.edu.MyFirstApp.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import neu.edu.MyFirstApp.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	final private LoginService loginService;

	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@GetMapping("/login")
    public String login() {
        return "login.html";
    }


	@PostMapping("/login")
	public String doLogin(@RequestParam String username, @RequestParam String password, HttpSession session) {

//		System.out.println("asfasdfsadf");
		if (loginService.authenticate(username, password)) {
			session.setAttribute("username", username);
			return "redirect:/dashboard";
		} else {
			return "redirect:/login";
		}
	}
	
	@GetMapping("/logout")
    public String logout(HttpSession session) {
        // Invalidate the session to log out the user
        session.invalidate();
        return "redirect:/";
    }
}
