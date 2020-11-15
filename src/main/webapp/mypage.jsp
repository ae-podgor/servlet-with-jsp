<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet-with-jsp</title>
</head>
<body>
<h1>Hello guest</h1>
<h2>Вызван метод GET проекта servlet witn JSP</h2>
</br>
<p>Текущее время ${time}</p>
</br>
<p>Все заголовки ${headers}</p>
</br>
<form action="/servlet_with_jsp/2" method="POST">
    <input type="text" name="name" value="Enter your name">
    <input type="text" name="email" value="Enter your email">
    <input type="submit" value="Send">
</form>
</body>
</html>