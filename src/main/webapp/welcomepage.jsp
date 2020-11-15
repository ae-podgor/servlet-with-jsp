<%--
  Created by IntelliJ IDEA.
  User: Alinka
  Date: 15.11.2020
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello!</title>
</head>
<body>
<h3>${man} ${email}</h3>
</br>
<form action="/servlet_with_jsp/welcome" method="POST">
    <input type="hidden" name="extra_submit_param" value="extra_submit_value">
    <button type="submit" name="submit_param" value="submit_value" class="link-button">
        Come back to the main page
    </button>
</form>
</body>
</html>
