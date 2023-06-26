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
        <img src="${file}" alt="${file}">
        <h2>${advert.brand} ${advert.model}</h2>
        <p>Cena : ${advert.price}</p>
        <p>Przebieg: ${advert.mileage}</p>
        <p>Rok Produkcji: ${advert.produce_year}</p>
        <p>Kontakt pod numerem telefonu: 333 444 555</p>
    </div>
</main>

<footer>
    <p>&copy; 2023 MotoSprzedaż</p>
</footer>
</body>
</body>
</html>
