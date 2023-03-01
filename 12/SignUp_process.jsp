<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: pavan
  Date: 2/28/2023
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

     String a1 = request.getParameter("cr1");
     String a2 =request.getParameter("crpass");

    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver loaded succesfully");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","pavan");

        PreparedStatement ps = con.prepareStatement("insert into login values (?,?)");

        ps.setString(1,a1);
        ps.setString(2,a2);

        int  rs=ps.executeUpdate();

    }catch(Exception  e){

        System.out.println(e);
    }






%>
</body>
</html>
