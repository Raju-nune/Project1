<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Html Webpage</h2>
<%--  JSP Comments --%>
<%!int a,b,sum; %>
<%
//int a =10;
//int b=20;
//int sum =a+b;
sum=a+b;
out.println("Welcome to jsp<br>");
out.println("sum of two numbers "+sum);
a=100;
b=200;
sum=a+b;
out.println("<br/> <font color=red> Sum of two number is "+sum+"</font>");
%>
<%
out.println("another scriptlet tag");
%>
<br/>
<p>Sum of two number is <%=10+20%></p> 
</body>
</html>