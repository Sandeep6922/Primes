package com.ubs.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ubs.model.PrimeResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.ubs.util.Math;

@RestController
@RequestMapping("/primes")
public class PrimeController {

	
	@GetMapping(path="/{initial}")
	public ResponseEntity calculatePrime(@PathVariable int initial) {
		
		 PrimeResponse response = new PrimeResponse();
		
		 response.setInitial(initial);
		 
		 response.setPrimes(new Math().evaluatePrime(initial));
		 
		return new ResponseEntity<PrimeResponse>(response,HttpStatus.OK);
	}
	
	
	
}
