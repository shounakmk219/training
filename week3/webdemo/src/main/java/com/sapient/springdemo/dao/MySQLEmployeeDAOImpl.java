package com.sapient.springdemo.dao;

import com.sapient.springdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "mysqlDAOImpl")
public class MySQLEmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public MySQLEmployeeDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Employee save(Employee employee) {
        System.out.println("Came inside the save method of MySQLEmployeeDAOImpl");
        jdbcTemplate.execute("insert into employee(id, ename) values ('"+employee.getId()+"','"+employee.getName()+"')");
        return employee;
    }

    public List<Employee> listAll() {
    	List<Employee> employeeList=jdbcTemplate.query("select * from employee",(rs,rn)-> new Employee(rs.getInt(1),rs.getString(2)));
    	return employeeList;
    }

    public Employee findById(long id) {
        return (Employee)jdbcTemplate.queryForObject("select * from employee where id="+id, (rs, rn)->new Employee(rs.getInt(1),rs.getString(2)));
    }

    public void deleteEmployee(long id) {

    }
}