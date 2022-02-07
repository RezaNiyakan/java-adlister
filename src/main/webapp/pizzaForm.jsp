<%--
  Created by IntelliJ IDEA.
  User: rezaniyakan
  Date: 2/4/22
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
    <h1>Pizza Order Form</h1>
<form action="/pizzaForm" method="post">
        <label for="crust">Crust:</label>
        <select name="crust" id="crust">
            <option value="thin">Crispy Thin</option>
            <option value="pan">Pan</option>
            <option value="deep dish">Deep Dish</option>
        </select>
        <br>
        <label for="sauce">Sauce:</label>
        <select name="sauce" id="sauce">
            <option value="original">Original Red Sauce</option>
            <option value="pesto">Pesto Sauce</option>
            <option value="alfredo">Alfredo Sauce</option>
        </select>
        <br>
        <label for="size">Size:</label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <br>
        <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni"/> <label for ="pepperoni">Pepperoni</label>
        <input type="checkbox" id="sausage" name="toppings" value="sausage"/> <label for ="sausage">Sausage</label>
    <input type="checkbox" id="mushroom" name="toppings" value="mushroom"/> <label for ="mushroom">Mushroom</label>
        <br />
        <label for="address">Delivery to:</label>
        <input type="text" id="address" name="address"/>
        <input type="submit" value="Submit Order">
</form>
</body>
</html>
