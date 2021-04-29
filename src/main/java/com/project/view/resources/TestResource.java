package com.project.view.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Controller
@RequestMapping("/website")
public class TestResource 
{
	@RequestMapping(value="test")
	public String test(Model model)	{
		model.addAttribute("message", "Aman Pradhan");
		return "test";
	}
	
	@RequestMapping(value="")
	public String index(Model model)
	{
		UserLogin login = new UserLogin();
    	model.addAttribute("login", login);
    	return "index";
	}

	@RequestMapping(value="home")
	public String home()	{
		return "home";
	}
	
	@RequestMapping(value="profile")
	public String profile()	{
		return "profile";
	}
	
	@RequestMapping("register")
	public String register(ModelMap model)
	{
		UserRegister register = new UserRegister();
    	model.addAttribute("register", register);

		return "register";
	}
	
/*******************************************************************************************************************/
	
	@PostMapping("login")
	public String login(@ModelAttribute("user") UserLogin login, Model model) {
		model.addAttribute("user", login.getUsername());
		return "profile";
	}
	
	@PostMapping("register")
	public String login(@ModelAttribute("register") UserRegister register, Model model) {
		model.addAttribute("user", register);
		return "test";
	}

}

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
class UserLogin
{
	private String username;
	private String password;
}


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
class UserRegister
{
	private String username;
	private String email;
	private String phone;
	private String password1;
	private String password2;
}
