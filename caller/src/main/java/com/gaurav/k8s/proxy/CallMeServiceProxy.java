package com.gaurav.k8s.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "currency-exchange", url = "${CALLME_SERVICE_URI}:8002")//
//@FeignClient(name = "currency-exchange", url = "${CURRENCY_EXCHANGE_SERVICE_HOST:http://localhost}:8000")
//@FeignClient(name = "currency-exchange-service")//Kubernetes Service Name
public interface CallMeServiceProxy {
	//http://localhost:8000/currency-exchange/from/USD/to/INR
	@GetMapping("/call")
	public String callMe();
}