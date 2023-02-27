// Operation.html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Programs</title>
</head>
<body>
<form action="Operation.jsp" method="post">
Enter Number :<input type="text" name="num">
<p><input type="radio" name="op" value="square" >Find Square of Entered Number</p>
<p><input type="radio" name="op" value="prime" > Check Whether entered number is prime or Not</p>
<p><input type="radio" name="op" value="cdate" >Display the Current date</p>
<p><input type="radio" name="op" value="even" >Check number is Even number or odd number</p>
<input type="submit" value="submit">
</form>
</body>
</html>

//Operation.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Operation</title>
</head>
<body>
<%
int i;
int n=Integer.parseInt(request.getParameter("num"));
String option=request.getParameter("op");
if(option.equals("square"))
{
int s=n*n;
out.println("Square of number is "+s);
}
if (option.equals("prime"))
{
int f=0;
for(i=2;i<=n/2;i++)
{
if(n%i==0){
f=1;
break;
}
}
if(f==0)
{
out.println(n+ " is a prime Number");
}
else{
out.println(n+ " is not a prime number");
}
}
if(option.equals("cdate"))
{
Date d=new Date();
out.print("<h2 align =\"center\">"+d.toString()+"<h2>");
}
if(option.equals("even"))
{
if(n%2==0){
out.println(n+ " is a even number");
}
else{
out.println(n+ " is odd number");
}
}
%>
</body>
</html>
