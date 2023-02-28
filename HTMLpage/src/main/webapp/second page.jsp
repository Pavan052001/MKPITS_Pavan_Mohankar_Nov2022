<%--
  Created by IntelliJ IDEA.
  User: pavan
  Date: 2/25/2023
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page 2</title>
</head>
<body>
<h1>Second</h1>
<%
    String s=request.getParameter("ename");
    out.print(s);
%>

</body>
</html>
