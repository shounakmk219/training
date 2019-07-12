package com.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDAO;
import com.employee.model.EmployeeModel;

/**
 * Servlet implementation class ListAll
 */
public class ListAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO emp=new EmployeeModel(); 
		List<Employee> list=emp.getAll();
		RequestDispatcher rd=request.getRequestDispatcher("listall.jsp");
		PrintWriter pr=response.getWriter();
		pr.println("<table><tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Designation</th><th>Salary</th>");
		for(int i=0;i<list.size();i++) {
			Employee temp=list.get(i);
			pr.println("<tr><td>"
					+temp.getId()+"</td><td>"
					+temp.getFirstName()+"</td><td>"
					+temp.getLastName()+"</td><td>"
					+temp.getDesignation()+"</td><td>"
					+temp.getSalary()+"</td></tr>"
					);
		}
		pr.println("</table>");
		rd.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
