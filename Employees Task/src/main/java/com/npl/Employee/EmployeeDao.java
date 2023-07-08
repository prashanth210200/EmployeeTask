package com.npl.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	

	@Autowired
	EmployeeRepository empRepo;

	public String addAll(EmployeeDetails emp) {
		empRepo.save(emp);
		return "Successfullyy Saved";
	}
	
	public List<EmployeeDetails> getAll() {
		return empRepo.findAll();
	}

	public List<EmployeeDetails> getAll(String searchKeyword) {
		return empRepo.findByWord(searchKeyword);
	}

	



}
