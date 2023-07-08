package com.npl.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_exp")
public class EmployeeExp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empCompanyName;
	private String empExperienceYear;
	private String empRole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpCompanyName() {
		return empCompanyName;
	}
	public void setEmpCompanyName(String empCompanyName) {
		this.empCompanyName = empCompanyName;
	}
	public String getEmpExperienceYear() {
		return empExperienceYear;
	}
	public void setEmpExperienceYear(String empExperienceYear) {
		this.empExperienceYear = empExperienceYear;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	

}
