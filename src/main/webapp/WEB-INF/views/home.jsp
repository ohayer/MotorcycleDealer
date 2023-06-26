<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file="/WEB-INF/views/style/home.css" %>
</style>
<html>
<head>
    <title>Skup motocykli</title>
</head>
<body>
<div class="main-horiz">
    <h1 style="padding-top: 15px;text-align: center; color: #cad2e0; font-size: 45px">MOTO-DEALER</h1>
    <div style="display: flex; justify-content: space-between; color: #cad2e0;">
        <h3 style="text-align: right; padding-left: 40px">We are working with passions to motorcycles</h3>
        <h3 style=" text-align: right;padding-right: 40px; ">Found that what you are looking for</h3>
    </div>
</div>
<img style="display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: auto;" src="/shops.jpg">

<div class="container">
    <c:forEach items="${adverts}" var="advert">
        <div class="item">
            <a href="http://localhost:8080/brand=${advert.brand}&model=${advert.model}&mileage=${advert.mileage}">
                <img src="${file.returnImage(advert.id)}" alt="${file}">
                <h3>${advert.brand} ${advert.model}</h3>
                <p>mileage :${advert.mileage} km</p>
                <p>produce year :${advert.produce_year}</p>
                <p>Price ${advert.price}PLN</p>
            </a>
        </div>
    </c:forEach>
</div>
<footer>
    <p>&copy; 2023 MotoSprzedaż</p>
    <h3>Contact us: </h3>
    <p>email: example@example.ex,</p>
    <p>Phone numer (+48) 111 111 111,</p>
    <p>Localization: Warsaw, street: Flower 10 , 355-321</p>
</footer>
</body>
</html>
