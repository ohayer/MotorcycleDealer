<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: olik0
  Date: 26.06.2023
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<style>
    <%@include file="/WEB-INF/views/style/product.css" %>
</style>
<head>
    <title>${advert.brand}, ${advert.model}</title>
</head>
<body>
<body>
<header>
    <h1>Oferta motocykla na sprzedaż</h1>
</header>

<main>
    <div class="motorcycle">
        <img src="${file.returnImage(advert.id)}" alt="${file}">
        <h2>${advert.brand} ${advert.model}</h2>
        <p>Cena : ${advert.price}</p>
        <p>Przebieg: ${advert.mileage}</p>
        <p>Rok Produkcji: ${advert.produce_year}</p>
        <p>Pojemność silnika: ${advert.engineSize} cm3</p>
        <p>ABS: ${advert.abs ? 'TAK' : 'NIE'}</p>
    </div>
</main>
<h2>Opis dodatkowy: </h2>
<h4>${advert.description}</h4>
<div class="photo">
    <c:forEach items="${file.getPhotosById(advert.id)}" var="photo">
        <img src="${file.returnImage(photo.getName())}" alt="${photo}">
    </c:forEach>
</div>
<footer class="myFoot">
    <p>&copy; 2023 MotoSprzedaż</p>
    <h3>Contact us: </h3>
    <p>email: example@example.ex,</p>
    <p>Phone numer (+48) 111 111 111,</p>
    <p>Localization: Warsaw, street: Flower 10 , 355-321</p>
</footer>
</body>
</body>
</html>
