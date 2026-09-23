package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/fs1")
public class FirstServlet extends GenericServlet{
 
	@Override
  	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
  	{
	  PrintWriter pw = res.getWriter();
	  res.setContentType("text/html");
	  
	  String emp_name = req.getParameter("eName"); 
	  String emp_id = req.getParameter("eId");
	  String emp_sal = req.getParameter("eSal");
	  String emp_Exp = req.getParameter("eExp");
	  
	  //System.out.println("UserName : "+ user_name);
	  //System.out.println("UserMail : "+ user_mail);
	  //System.out.println("UserDOB : "+ user_dob);
	  
	  int year = Integer.parseInt(emp_Exp);
	  int sal = Integer.parseInt(emp_sal);
	  
	  if(year>=5)
	  {
		  double exp_sal = sal + (sal * 0.10);
		 
		  pw.print("<center><h1>");
		  pw.print("***** Employee Details *****"+ "<br><br>");
		  pw.print("Emp Name "+ emp_name+ "<br><br>");
		  pw.print("Emp Id "+ emp_id+ "<br><br>");
		  pw.print("Emp Salary "+ exp_sal + "<br><br>");
		  pw.print("Emp Years Of Experience "+ year+ "<br><br>");
		  pw.print("</center></h1>");
		  
	  }
	  else
	  {
		  pw.print("<center><h1>");
		  pw.print("***** Employee Details *****"+ "<br><br>");
		  pw.print("Emp Name "+ emp_name+ "<br><br>");
		  pw.print("Emp Id "+ emp_id+ "<br><br>");
		  pw.print("Emp Salary "+ sal + "<br><br>");
		  pw.print("Emp Years Of Experience "+ year+ "<br><br>");
		  pw.print("</center></h1>");
		  
	  }
	    
  	}
}
