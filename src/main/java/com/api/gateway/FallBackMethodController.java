package com.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/bookServiceFallBack")
	public String bookServiceFallBackMethod() {
		return "Book service is down, please try after some time";
	}
	
	@GetMapping("/subscriptionServiceFallBack")
	public String subscriptionServiceFallBackMethod() {
		return "Subscription service is down, please try after some time";
	}
}
