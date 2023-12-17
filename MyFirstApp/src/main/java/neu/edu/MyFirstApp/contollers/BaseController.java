package neu.edu.MyFirstApp.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class BaseController {
	
	@GetMapping("/")
    public String home(HttpSession session) {
        // Check if the user is logged in
        if (session.getAttribute("username") != null) {
            return "dashboard.html";
        }
        return "home.html";
    }

    

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        // Check if the user is logged in
    	
        if (session.getAttribute("username") == null) {
            return "redirect:/login";
        }
        model.addAttribute("username", session.getAttribute("username"));

        return "dashboard.html";
    }

    

}
