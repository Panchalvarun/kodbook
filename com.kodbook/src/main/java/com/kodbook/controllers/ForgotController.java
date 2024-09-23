package com.kodbook.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ForgotController {
	
	Random random=new Random(1000);
	
	@PostMapping("/verifyOTP")
	public String sendOTP(@RequestParam("email") String email) {
		
		System.out.println("EMAIL"+email);
		
	    
	    
	    int otp=random.nextInt(999999);
	    
	    System.out.println("OTP"+otp);
	    
	    return "verifyotp";
		
		
	}
	
}
