<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.SignupPojo" %>
    <%@ page import="java.util.ArrayList" %>
    
    <%@ page import ="dao.SignupPageDAO" %>
    <%@ page import="java.sql.SQLException
    " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

table {
  width: 100%;
}

th {
  height: 70px;
}
</style>
</head>
<body>
<% SignupPojo pj=new SignupPojo(); %>
<table>
<tr>
   <th>Name</th>
   <th>Phone</th>
   <th>Mail</th>
</tr>
 <% ArrayList<SignupPojo> values=(ArrayList<SignupPojo>)request.getAttribute("signup");
 
 for( SignupPojo values1:values){
              
            %>
            <tr>
                <td><%= values1.getName()  %></td>
                <td><%= values1.getTel() %></td>
                <td><%= values1.getMail()%></td>
            </tr>
            <%
 }
               
            %>



</table>


</body>
</html>