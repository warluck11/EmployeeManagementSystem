package com.itvedant.employee;

import java.sql.Connection;
import java.util.List;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		EmployeeService eservice = new EmployeeService();
		
		List<Employee> employees = eservice.readRecords();
		
		
		for(Employee x : employees) {
			System.out.println(x);
		}
		
	}

}
