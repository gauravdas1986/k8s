package com.gaurav.k8s.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.k8s.proxy.CallMeServiceProxy;
import com.gaurav.k8s.util.environment.InstanceInformationService;

@RestController
public class CallerController {
	
	@Autowired
	private CallMeServiceProxy proxy;
	
	@Autowired
	private InstanceInformationService instanceInformationService;

	@GetMapping("/caller")
	public String callMe() {
		return proxy.callMe()+instanceInformationService.retrieveInstanceInfo();
	}
}
