<html>
<body>
<h2>Hello World!</h2>
<%-- print the statement --%>
<%
out.print("This is JSP based ");
%>
<%--Print the statement without out.print()--%>
<br>
<%= "This is second page"%>
<%--declare the variable and initialize the value--%>
<%String name = "Kartikey Pandey";
out.print("My name is "+"<br>"+name );
%>
</body>
</html>
