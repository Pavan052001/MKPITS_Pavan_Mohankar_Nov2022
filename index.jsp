<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
    String s=request.getParameter("sId");
    String s1=request.getParameter("spass");

    try{
        Class.forName("com.mysql.jdbc.driver");
        System.out.println("driver loaded");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","pavan");
        PreparedStatement ps= con.prepareStatement("select sales_id,sales_pass from login where sales_id=? and sales_pass=?");

        ps.setString(1,s);
        ps.setString(2,s1);

        ResultSet r1=ps.executeQuery();

        if(r1.next()) {
            response.sendRedirect("Login_success.jsp");
        }
        else{
            response.sendRedirect("Errorpage.html");
        }


    }catch
    (Exception e){

        System.out.println(e);
    }


%>


</h1>
<br/>

</body>
</html>