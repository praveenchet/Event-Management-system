package com.EventManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.EventManagement.Entities.Customer;
import com.EventManagement.Entities.User;
import com.EventManagement.service.UserServices;

@Controller
@RestController
@RequestMapping("/User")
public class UserController 
{
//	@Autowired
//	private UserServices userServices;
//	
//	@GetMapping("/logIn")
//	public String logIn(Model model) 
//	{
//		User user=new User();
//		model.addAttribute("user", user);
//		return "log_InPage";
//	}
//	@PostMapping("/adduser")
//    public String addUser(@ModelAttribute("user") User user) 
//    {
//        userServices.addUser(user);
//        return "dashboard";
//}
//	
//	@GetMapping("/LogInForCurrentUser1")
//	public String LogInForCurrentUser(Model model) 
//	{
//		User user=new User();
//		model.addAttribute("user", user);
//		return "LogInForCurrentUser";
//	}
  /*  @GetMapping("/showNewCustomerForm")
    public String showNewCustomerForm(Model model) {
    	//create model attribute to bind form data
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customerSignUp";
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@ModelAttribute("customer") Customer customer) 
    {
        customerServices.addCustomer(customer);
        return "log_InPage";
}*/
    

	
//	@GetMapping("/dashboard")
//	public String dashboard(Model model) 
//	{
//		model.addAttribute("username", userServices.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getUsername());
//		
//		return "dashboard";
//	}
//	@GetMapping("/dashboard")
//	public String dashboard(Model model) 
//	{
//		model.addAttribute("username", userServices.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getUsername());
//		
//		return "dashboard";
//	}
//	@PostMapping("/logIn")
//	public String login(@RequestParam("username") String username,
//	     @RequestParam("password") String password,
//	      RedirectAttributes redirectAttributes) 
//	{
//	        // Your login logic here...
//	        // For demonstration purposes, assume login is successful
//	        boolean loginSuccessful = true;
//
//	        if (loginSuccessful) {
//	            return "redirect:/dashboard"; // Redirect to the dashboard
//	        } else {
//	            // Add error message if login failed
//	            redirectAttributes.addFlashAttribute("errorMessage", "Invalid username or password");
//	            return "redirect:/log_InPage"; // Redirect back to the login page
//	        }
//	    }
	
}
