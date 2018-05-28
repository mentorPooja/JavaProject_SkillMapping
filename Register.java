package com.niit.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.validation.MyValidation;
import com.niit.repository.EmpDAO;
import com.niit.entities.Employee;;
/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("in servlet");
		
		int    empId;
	    String  empName;
	    String  empEmail;
	    Long   empMobile=09604864655l;
	    String  empGender;
	    String  empAddress;
	    String  empCity;
	    String  empNationality;
	    String  empDob;
	    String  empRole;
	    String empPassword;
	    String empStatus;
	    String IBUName;
	    
		//com.niit.validation.Validation val = new com.niit.validation.Validation();
	   MyValidation mval = new MyValidation();
		
		empId = Integer.parseInt(request.getParameter("empId"));
		empName = request.getParameter("empnm");
		empGender = request.getParameter("empgen");
		empAddress = request.getParameter("empaddr");
		empCity = request.getParameter("empcity");
		empDob = request.getParameter("empdt");
		empRole = request.getParameter("emprole");
		empEmail = request.getParameter("empemail");
	    empPassword = request.getParameter("emppwd");
		empNationality = request.getParameter("empnation");
		IBUName= request.getParameter("ib");
	//	empMobile = Long.parseLong(request.getParameter("empmob"));
		String empSid = request.getParameter("empSupId");
		String empSname= request.getParameter("empSupNm");
		String empscon= request.getParameter("empSupCon");
		out.println("Welcome"+empName);
		
		
		 if(mval.emailValidate(empEmail))
		   out.println("Email Validated");
			 else
		    	{
				 out.println("Invalid EmailId");
				 RequestDispatcher reqD=request.getRequestDispatcher("Registration.jsp");
				    reqD.include(request,response);
		    	}
		    if(mval.mobileValidate(empMobile))
				out.print("mobile no validated");
				
		    else
		    {
		    	out.println("Invalid MobileNo");
		   	 RequestDispatcher reqD=request.getRequestDispatcher("Registration.jsp");
			    reqD.include(request,response);
	    	}
	    
		    
		    if(MyValidation.passwordValidate(empPassword))
		    	out.println("password validated");
		    else
		    	{
		    	out.println("password Invalid");
		   	 RequestDispatcher reqD=request.getRequestDispatcher("Registration.jsp");
			    reqD.include(request,response);
	    	}
	    
		    	
		    	
		    EmpDAO empRetrive = new EmpDAO();
		    Employee pass = new Employee();
		    ArrayList<Employee> emp = new ArrayList<>();
		    out.println("\n\nWelcome user");
		    emp = empRetrive.retrieve(pass);
		    out.println(3);
		    for(Employee e: emp)
		    {
		    	out.println(1);
		    	out.print(e.getEmpId()+" "+e.getEmpName());
		    }
		    out.println(2);
		   // RequestDispatcher reqD=request.getRequestDispatcher("profile");
		    //reqD.forward(request, response);

		//	doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
				doGet(request, response);
	}

}
