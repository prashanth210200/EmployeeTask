package com.npl.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empSer;
	
	
	@PostMapping("/addDetails")
	public String addAll(@RequestBody EmployeeDetails emp){
		return empSer.addAll(emp);
	}
	@GetMapping("/getAllEmp")
	public List<EmployeeDetails> getAllEmp(){
		return empSer.getAllEmp();
	}
	
	@GetMapping("/getdetails/{search}")
	public List<EmployeeDetails> getAll(@PathVariable("search") String searchKeyword){
		return empSer.getAll(searchKeyword);
	}
// @GetMapping("/{word}")
// public ResponseEntity<List<EmployeeController>> getWordsByWord(@PathVariable String word){
//	 List<EmployeeController>words=word
 

}
