package com.npl.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao empDao;

	public String addAll(EmployeeDetails emp) {
	
		return empDao.addAll(emp);
	}

	public List<EmployeeDetails> getAll(String searchKeyword) {
		
		return empDao.getAll(searchKeyword);
	}

	public List<EmployeeDetails> getAllEmp() {
		return empDao.getAll();
	}

}
