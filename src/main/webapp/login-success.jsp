
<%@ page import="beans.PlayerBean" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Player" %>
<%@ page import="beans.LoginBean" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    PlayerBean playerBean = (PlayerBean)request.getAttribute("playerBean");
    List<Player> players = playerBean.getAllPlayers();
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
<div class="paranja">

</div>

<div class="header">
    <div class="header-content">
        <div class="menu">
            <a href="#">Main</a>
            <a href="#">Players</a>
            <a href="#">Statistic</a>
            <%out.print("<a href=/profile?loginBean=" + loginBean + ">Profile </a>");%>
        </div>
        <a href="/home" id="signIn">Log out</a>
        <input type="search" class="search" placeholder="Search">

    </div>
    <a href="#"> </a>
</div>
<div class="container">
    <h2 class="players">Atletico Madrid:</h2>
    <% for (Player player : players) {
        out.println("<a class = \"players\" href=\"#\"> " + player.getName());
        out.println(player.getNumber() + "</a><br/> ");
    }
    %>
</div>
<div class="footer">
    <div class="footer-content">
        <p>Erdyneev Maydari</p>
    </div>

</div>
<div class="window">
    <span class="close" onclick="hideElem()">x</span>
    <div class="content">
        <form action="login" method="post" accept-charse="utf-8">
            <p>Authorization</p>
            <p><input type="text" name="name" placeholder="Your login or email"></p>
            <p><input type="password" name="password" placeholder="Your password"></p>
            <p><button type="submit">Enter</button></p>
        </form>
    </div>
</div>
</body>
</html>


