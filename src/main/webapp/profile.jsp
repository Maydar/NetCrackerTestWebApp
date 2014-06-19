
<%@ page import="java.util.List" %>
<%@ page import="model.Player" %>
<%@ page import="beans.LoginBean" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    LoginBean loginBean = (LoginBean)request.getAttribute("loginBean");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Football Manager</title>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" href="css/main.css">
    <script type="text/javascript" src="js/main.js"></script>
</head>
<body>

<div class="header">
    <div class="header-content">
        <div class="menu">
            <a href="#">Main</a>
            <a href="#">Players</a>
            <a href="#">Statistic</a>
        </div>
        <a href="/home" id="signIn">Log out</a>
        <input type="search" class="search" placeholder="Search">

    </div>
    <a href="#"> </a>
</div>
<div class="container">
    <h2 class="players">My profile:</h2>
    <%
        out.println("<p class= \"players\"> " + loginBean.getUserName() + "</p>");
        out.println("<p class= \"players\"> " + loginBean.getFIO() + "</p>");
        out.println("<p class= \"players\"> "+ loginBean.getEmail() + "</p>");
    %>
</div>
<div class="footer">
    <div class="footer-content">
        <p>Erdyneev Maydari</p>
    </div>

</div>
</body>
</html>

