<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%
    String session_id=(String)session.getAttribute("session_id");
%>
<h1>Welcome<%=""+session_id %></h1>


</body>
</html>