<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: pavan
  Date: 2/28/2023
  Time: 4:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String s=request.getParameter("sId");
    String s1=request.getParameter("spass");

    session.setAttribute("session_id",s);


    try{

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver loaded");

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","pavan");
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

</body>
</html>
