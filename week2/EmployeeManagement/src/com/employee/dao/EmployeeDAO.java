package com.employee.dao;

import java.util.List;

import com.employee.bean.Employee;

public interface EmployeeDAO {
	public boolean addEmployee(Employee employee);
	public Employee getEmployee(String id);
	public List<Employee> getAll();
	public boolean deleteEmployee(String id);
	public boolean updateEmployee(Employee employee);
}
