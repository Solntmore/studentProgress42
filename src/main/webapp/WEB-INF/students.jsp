<%--
  Created by IntelliJ IDEA.
  User: solnt
  Date: 11.04.2024
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Kelly+Slab&display=swap" rel="stylesheet">
    <title>student</title>
</head>
<body>
<aside class="navigation">
    <a href="#" class="navigation-item">на главную</a>

</aside>

<main class="main">
    <h1 class="main-heading"> система управления студентами и их успеваемостью

    </h1>

    <div class="student-btns">
        <div class="student-btns1">
            <button class="student-btn"> посмотреть умпеваемость выбранных студентов</button>
            <button class="student-btn"> модифицировать выбранного студента</button>
        </div>
        <div class="student-btns1">
            <button class="student-btn"> создать студента</button>
            <button class="student-btn">удалить выбранных студентов</button>
        </div>
    </div>
    <h2 class="heading-secondary">
        список студентов
    </h2>
    <table class="student-table" border="1">
        <tr>
            <th>&nbsp</th>
            <th>фамилия</th>
            <th>имя</th>
            <th>группа</th>
            <th>дата поступления</th>
        </tr>

        <c:forEach items="${students}" var="st">
            <tr>
                <td> <input type="checkbox" id="">
                </td>
                <td>${st.surname}</td>
                <td>${st.name}</td>
                <td>${st.groups}</td>
                <td>${st.date}</td>
            </tr>
        </c:forEach>


    </table>

</main>
<aside class="logout">
    <a href="#" class="logout-btn">logout</a>

</aside>

</body>
</html>
