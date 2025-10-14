package com.airlines.task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Airlines")
public class Airline {

	
	
  @PostMapping("/login")
	public String Login () {
		return " Login SussessFuly !";
	}
	
	@GetMapping("/book")
	public String Book() {
		return " book your Ticket";
		
	}
	
	@GetMapping("/profile")
	public String Profile() {
		return " Check Your Profile";
		
	}
	
	@RequestMapping(value = "/DealsOffer" , method = RequestMethod.GET)
	public String DealsOffer() {
		return " Checks New Offers";
		
	}
	
	@DeleteMapping("/checkin")
	public String ChekinIn() {
		return " Check Your BordingTime";
		
	}
	@PostMapping("/status")
	public String status() {
		return " Check your Booking Status";
		}
	
	@PostMapping("/traffic")
	public String TraficSheet() {
		return " Check Traffic sheet";
		}
	
	@GetMapping("/payment")
	public String Payment() {
		return " Payment Scuessfuly !";
		}
	
	@GetMapping("/cancles")
	public String Cancle() {
		return " Cancle Your Bokking";
		}
	

	@PutMapping("/trip")
	public String Trip() {
		return " Enjoy Your Trip";
		
	}
	

}
