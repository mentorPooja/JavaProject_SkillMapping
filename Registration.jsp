<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Registration Form For Employees</h1>


	<form method="post" action="register">
	Enter U R Employee ID :  
	<input type="text" name="empId"><br/>
	Employee Name :  
	
	<input type="text" name="empnm"><br/>
	Enter Password :
	<input type="password" name="emppwd"><br/>
	Re-enter Password :
	<input type="password" name="emppwd"><br/>
	Employee Email : 
	<input type="text" name="empemail"><br/>
	Employee Mobile No :  
	<input type="text" name="empmob"><br/>
	Employee Gender : <br/>
	<input type="radio" name="empgen" value="Male">Male<br/>
	<input type="radio" name="empgen" value="Female">Female<br/>
	
	Employee Address : 
	<input type="textarea" name="empaddr"><br/>
	Employee City : 
	<input type="text" name="empcity"><br/>
	Employee Nationality : 
	<input type="text" name="empnation"><br/>
	Employee Birth Date : 
	<input type="date" name="empdt"><br/>
	Employee Role : 
	<input type="text" name="emprole"><br/>
	Employee IBUName : 
	<select name="ib">
  <option value="ils">ILS</option>
  <option value="ifbi">IFBI</option>
  <option value="ceb">CEB</option>
  <option value="sls">SLS</option>
  <option value="grb">GRB</option>
  
</select><br/><br/>
	Employee SupervisorID : 
	<input type="text" name="empSupId"><br/>
	Employee SupervisorName : 
	<input type="text" name="empSupNm"><br/>
	Employee Supervisor Contact : 
	<input type="text" name="empSupCon"><br/>
	
	<br/>

	<input type ="submit" value= "Register" >
	<input type = "reset" value="Reset">
	
	</form>

</body>
</html>