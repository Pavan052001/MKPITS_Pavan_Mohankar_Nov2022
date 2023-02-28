<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<% int a=2,b=3;
    if(a>b){
        %>
        <h1> a is greater</h1>
<%
    }else{
        %>
          <font color="red"> <h1> b is greater</h1> </font>
<%
}
%>
<br>
<% for (int i = 0; i < 7; i++) {
    %>
        <font size="<%=""+i     %>">hii</font> <br>
<%
}
%>
<a href="page 2">Hello Servlet</a>
<br>
<form action="second page.jsp" method="post">
    Enter name <input type="text" name="ename">
    <br>
    <input type="submit">

</form>
</body>
</html>