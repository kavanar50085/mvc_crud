<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insert" method="post">
	<table>
		<tr>
			<td><label for="name" >Name</label></td>
			<td><input type="text" name="name" id="name"></td>
	    </tr>
	    
	    <tr>
			<td><label for="email" >Email</label></td>
			<td><input type="email" name="email" id="email"></td>
	    </tr>
	    
	     <tr>
			<td><label for="mobile" >Mobile</label></td>
			<td><input type="number" name="mobile" id="mob"></td>
	    </tr>
	    
	     <tr>
			<td><label for="dob" >DOB</label></td>
			<td><input type="date" name="date" id="dob"></td>
	    </tr>
	    
	     <tr>
			<td><label for="gender" >Gender</label></td>
			<td><input type="radio" name="gender" id="gender" value="male">Male
			<input type="radio" name="gender" id="gender" value="female">Female
			</td>
	    </tr>
	    
	    <table>
	    	<h3>Marks:</h3>
	    	<tr>
	    		<td><label for="eng" >English</label></td>
	    		<td><input type="number" name="eng" id="eng" value="English"></td>
	    	</tr>
	    	
	    	<tr>
	    		<td><label for="sci" >Science</label></td>
	    		<td><input type="number" name="sci" id="sci"  value="Science"></td>
	    	</tr>
	    	
	    	<tr>
	    		<td><label for="math" >Maths</label></td>
	    		<td><input type="number" name="math" id="math" value="Maths"></td>
	    	</tr>
	    		
	    </table>
	    
	    <tr>
	    	<td><button>Save</button></td>
	    	<td><button>Cancel</button></td> 
	   </tr>
	   
	  </table>
	</form>
	</body>
	</html>