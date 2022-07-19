package com.example.project.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.project.util.GenericResponse;

@RestController
@RequestMapping("/api/external/")
public class ExternalRestApiController {

	@GetMapping("/externalapi")
	public ResponseEntity<Object> msg() {

		String msg = "External Api !!";
		return ResponseEntity.ok(new GenericResponse("111", "API Called !!", msg));
	}

	@GetMapping("/external-msg")
	public ResponseEntity<Object> externalAPICallOne() {

		String url = "http://localhost:8090/eCommerce/api/external/externalapi";
		RestTemplate restTemplate = new RestTemplate();
		Object externalAPIMsg = restTemplate.getForObject(url, Object.class);

		return ResponseEntity.ok(new GenericResponse("222", "API Called !!", externalAPIMsg));
	}

	
	  @GetMapping("/thirdpartyapi") 
	  public ResponseEntity<Object> externalAPICallTwo(){
	  
	  String url = "http://localhost:8000/spring-boot/api/loan/externalthirdapi";
	  
	  
	  RestTemplate restTemplate = new RestTemplate(); 
	  Object externalAPIMsg = restTemplate.getForObject(url, Object.class);
	  
	  return ResponseEntity.ok(new GenericResponse("222", "API Called !!",
	  externalAPIMsg));
	  }
	 

}
