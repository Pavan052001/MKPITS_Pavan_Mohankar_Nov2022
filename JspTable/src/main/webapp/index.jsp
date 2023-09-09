<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="Error.jsp" %>
<!DOCTYPE html>

<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>


<%

    Class.forName("com.mysql.cj.jdbc.Drivers");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfamilydb", "root", "pavan");
    Statement st = con.createStatement();
    String ps = "select * from person";
    ResultSet rs = st.executeQuery(ps);

    while (rs.next()) {
%>
<table border="2">
    <tr>
        <td><%=rs.getString("Id")%>
        </td>
        <td><%=rs.getString("last_name")%>
        </td>
        <td><%=rs.getString("first_name")%>
        </td>
        <td><%=rs.getString("salary")%>
        </td>
    </tr>
</table>
<%
    }


%>
</body>
</html>