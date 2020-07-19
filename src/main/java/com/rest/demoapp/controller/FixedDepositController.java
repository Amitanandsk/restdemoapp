package com.rest.demoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rest.demoapp.entity.FixedDepositDetails;
import com.rest.demoapp.service.FixedDepositService;

@Controller
@RequestMapping(path="/fixedDeposits")
public class FixedDepositController {
	
	@Autowired
	private FixedDepositService fixedDepositService;

	@GetMapping
	public ResponseEntity<List<FixedDepositDetails>> getFixedDepositList(){
		return new ResponseEntity<>( fixedDepositService.getFixedDeposit(),HttpStatus.OK);
		
	}
	
	@GetMapping(params = "id")
	public ResponseEntity<FixedDepositDetails> getFixedDeposit(@RequestParam("id") int id){
		
	}
	
	@PostMapping
	public void openFixedDeposits(FixedDepositDetails fixedDepositDetails) {
		
	}
	
	@PutMapping
	public void editFixedDeposits(@RequestParam("id") int id ,FixedDepositDetails fixedDepositDetails) {
		
	}
	
	@DeleteMapping(params = "id")
	public void closeFixedDeposits(@RequestParam("id") int id) {
		
	}
}
