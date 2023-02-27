//Hobbie.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Servlet</title>
</head>
<body>
<form method="get" action="HobbyServlet">
<pre>
<input type="checkbox" name="hobby" value="Singing">Singing</br>
<input type="checkbox" name="hobby" value="Dancing">Dancing</br>
<input type="checkbox" name="hobby" value="Reading">Reading</br>
<input type="checkbox" name="hobby" value="Playing">Playing</br>
<input type="checkbox" name="hobby" value="Walking">Walking</br>
<input type="submit" value="Submit">
<input type="reset" value="reset">
</pre>
</form>
</body>
</html>

//HobbyServlet.java

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HobbyServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
public HobbyServlet() {
super();
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String[] h=request.getParameterValues("hobby");
PrintWriter pw=response.getWriter();
response.setContentType("text/html");
pw.print("<html><body>");
pw.println("<h1> Your Hobbies are :</h1>");
pw.print("<ul>");
for(String s:h) {
if(s.equals("Singing"))
{
pw.println("<li>"+ s +"<li>");
pw.println("I Like Classical Music");
}
if(s.equals("Reading"))
{
pw.println("<li>"+ s +"<li>");
pw.println("I Like Story Books");
}
if(s.equals("Dancing"))
{
pw.println("<li>"+ s +"<li>");
pw.println("I Like Classical Dance");
}
if(s.equals("Playing"))
{
pw.println("<li>"+ s +"<li>");
pw.println("I Like to play Cricket");
}
if(s.equals("Walking"))
{
pw.println("<li>"+ s +"<li>");
pw.println("I Like Walking");
}
}
pw.print("</ul>");
pw.print("</body></html>");
pw.close(); 
}
}
