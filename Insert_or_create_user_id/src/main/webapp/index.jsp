<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<br/>
<%   String s= request.getParameter("ename");
     String s1=request.getParameter("epass");

     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         System.out.println("driver loaded succesfully");

         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_info","root","pavan");

         PreparedStatement ps = con.prepareStatement("insert into table1 values (?,?)");


         ps.setString(1,s);
         ps.setString(2,s1);

         int  rs=ps.executeUpdate();


     }catch(Exception  e){

         System.out.println(e);
     }





%>
</body>
</html>