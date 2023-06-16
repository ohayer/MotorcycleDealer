<%--
  Created by IntelliJ IDEA.
  User: olik0
  Date: 16.06.2023
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Images</title>
</head>
<body>
<h2>Formularz z dodawaniem zdjęć, INSTRUKCJA</h2>
<h3>1. SPRAWDŹ ID SAMOCHODU DO KTÓREGO CHCESZ DODAĆ ZDJĘCIA</h3>
<h3>2. NAZWIJ PRAWIDŁOWO ZDJĘCIA WEDŁUG WZORU : ID#NUMERZDJECIA</h3>
<P>PRZYKŁADOWO NAZWANE ZDJĘCIE 1#1.PNG</P>
<form action="/moto/photo" method="POST" enctype="multipart/form-data">
    <input type="file" name="zdjecia" accept=".jpg, .png" multiple="multiple" max="10">
    <br><br>
    <input type="submit" value="Wyślij">
</form>
</body>
</html>
