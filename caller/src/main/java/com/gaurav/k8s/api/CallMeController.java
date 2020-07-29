package com.gaurav.k8s.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.k8s.util.environment.InstanceInformationService;

@RestController
public class CallMeController {
	@Autowired
	private InstanceInformationService instanceInformationService;

	@GetMapping("/call")
	public String callMe() {
		return instanceInformationService.retrieveInstanceInfo();
	}
}
