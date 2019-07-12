package com.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDAO;
import com.employee.model.EmployeeModel;

/**
 * Servlet implementation class DeleteEmployee
 */
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid=request.getParameter("eid");
		String password=request.getParameter("password");
		EmployeeDAO emp=new EmployeeModel(); //(EmployeeModel)factory.getBean("emp");
		Employee employee=emp.getEmployee(eid);
		if(employee!=null) {
			if(employee.getPassword().equals(password)) {
				if(emp.deleteEmployee(eid)) {
					PrintWriter pr=response.getWriter();
					pr.println("<h2>Employee deleted!</h2>");
					RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
					rd.include(request, response);
				}
				else {
					PrintWriter pr=response.getWriter();
					pr.println("<h2>Database error!</h2>");
					RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
					rd.include(request, response);
				}
			}
			else {
				PrintWriter pr=response.getWriter();
				pr.println("<h2>Invalid Pasword!</h2>");
				RequestDispatcher rd=request.getRequestDispatcher("deleteemployee.jsp");
				rd.include(request, response);
			}
		}
		else {
			PrintWriter pr=response.getWriter();
			pr.println("<h2>Invalid Employee Id!</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("deleteemployee.jsp");
			rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
