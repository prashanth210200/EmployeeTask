package com.npl.Employee;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {

	

	/*
	 * @Query(value =
	 * "SELECT id, mobile_number, address, dob, email_id, first_name, last_name " +
	 * "FROM employee_details " + "CROSS JOIN employee_exp " +
	 * "WHERE CONCAT(id, mobile_number, address, dob, email_id, first_name, last_name) REGEXP ?1"
	 * , nativeQuery = true)
	 * 
	 * 
	 *    @Query("SELECT e FROM YourEntity e WHERE CONCAT(e.column1, e.column2) REGEXP :regexPattern")
	 */
	//@Query("SELECT e FROM YourEntity e WHERE e.columnName LIKE %:term%")
	
	@Query(value = "SELECT id,mobile_number,address,dob,email_id, first_name,last_name FROM"
			+ " employee_details WHERE CONCAT(id,mobile_number,address,dob,email_id, first_name,last_name)"
			+ " REGEXP ?", nativeQuery = true)
	public List<EmployeeDetails> findByWord(String searchKeyword);
	
}
