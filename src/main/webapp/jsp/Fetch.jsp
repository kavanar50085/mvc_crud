<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch</title>
</head>
<body>
<h1 style="color:blue">${pass}</h1>
<table border="1">
     <tr>
      <th colspan="6">Personal</th>
      <th colspan="5">Personal</th>
      <th colspan="2">Personal</th>
     </tr>
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Email</th>
      <th>Mobile</th>
      <th>Dob</th>
      <th>Gender</th>
      <th>English</th>
      <th>Science</th>
      <th>Mathematics</th>
      <th>Percentage</th>
      <th>Result</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
    <c:forEach var="student" items="${list}">
    <tr>
      <th>${student.getId()}</th>
      <th>${student.getname()}</th>
      <th>${student.getemail()}</th>
      <th>${student.getmobile()}</th>
      <th>${student.getdob()}</th>
      <th>${student.getgender()}</th>
      <th>${student.geteng()}</th>
      <th>${student.getsci()}</th>
      <th>${student.getmath()}</th>
      <th>${student.getpercentage()}</th>
      <th>${student.getresult()}</th>
      <th><button>Edit</button></th>
      <th><a hef="delete?id=${student.getId()}"></a><button>Delete</button></th>
    </tr>
      </c:forEach>
</table>
</body>
</html>