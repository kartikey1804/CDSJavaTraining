<html>
<body>
<h2>Hello World!</h2>
<%--scriptlet jsp code in html--%>
<%
// To print the name
out.print("Hii I am Kartikey Pandey");
%>
<br>
<%="My email id is kartikeyp@gaml.com "%>
<br>
<%
String name = "Shruti Sharma";
out.print("My friend name is "+name);
%>
<br>
<%
int a = 7;
int b = 9;
out.print(a+b);
%>
<br>
<%!
int square(int n){
return n*n;
}
%>
<%= "square is"+square(2) %>
<br>
<%
for(int i= 1;i<= 10; i++)
{
out.print(10+"X"+i +"="+(i*10)+"<br>");
}
%>
<%
String data = request.getParameter("username");
out.print("my name is "+data);
%>
</body>
</html>
