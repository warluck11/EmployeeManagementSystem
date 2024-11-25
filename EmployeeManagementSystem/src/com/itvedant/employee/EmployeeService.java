package com.itvedant.employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	
	static Connection con = DBConnect.getConnection();
	
	public List<Employee> readRecords(){
		
		List<Employee> employees = new ArrayList<Employee>();
		
		String query = "select * from employee";
		
		try {
			
			Statement stats = con.createStatement();
			
			ResultSet rs = stats.executeQuery(query);
			
			while(rs.next()) {
				Employee e = new Employee();
				
				e.setId(rs.getInt("id"));
				e.setFirst_name(rs.getString("first_name"));
				e.setLast_name(rs.getString("last_name"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getLong("mobile"));
				e.setDepartment(rs.getString("department"));
				e.setSalary(rs.getInt("salary"));
				
				employees.add(e);
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return employees;
	}
	

}
