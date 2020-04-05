<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
    <style>

       img {
            width: 80%;
            height: 20%;
        }
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
            width: 150px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>Top 5 Most Deadly VIRUSES</h2>

<table>
    <tr>
        <th>ID</th>
        <th> VIRUS Name</th>
        <th> Description</th>
        <th> Symptoms</th>
        <th> Duration</th>
        <th> MortalityRate</th>
        <th> Image</th>


    </tr>
    <c:forEach var = "listitem" items = "${viruslist}">
        <tr>
            <td>${listitem.getId()}</td>
            <td>${listitem.getName()}</td>
            <td>${listitem.getDescription()}</td>
            <td>${listitem.getSymptoms()}</td>
            <td>${listitem.getDuration()}</td>
            <td>${listitem.getMortalityrate()}</td>
            <td><img src="${listitem.getImageaddress()}"></td>





           <%-- <td>
                <a href="/view/${listitem.getId()}">View</a>
                <a href="/edit/${listitem.getId()}">Edit</a>
                <a href="/delete/${listitem.getId()}"><img src="../../img/delete.jpg" alt="delete_image" ></a>
            </td>--%>
        </tr>
    </c:forEach>
</table>
<%--
<form method="post" action="/save">
    <input type="hidden" name="id" value="">
    First name:<br>
    <input type="text" name="firstname">
    <br>
    Last name:<br>
    <input type="text" name="lastname" >
    <br><br>
    <input type="submit" value="Submit">
</form>--%>
</body>
</html>
