<%--
  Created by IntelliJ IDEA.
  User: nielsbechnielsen
  Date: 24/01/2016
  Time: 12.07
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="biblio"/>
    <title>Vis bog</title>
</head>

<body>

<h2>${book.title}</h2>

<p>${book.description}</p>


<h4>reviews</h4>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Date</th>
        <th>User</th>
        <th>Review</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${reviews}" var="review">
        <tr>
            <td><g:formatDate format="yyyy-MM-dd HH:mm" date="${review.dateCreated}"/> </td>
            <td>${review.user.loginId}</td>
            <td><fun:clip text="${review.text}" size="40"/></td>
        </tr>
    </g:each>

    </tbody>
</table>


</body>
</html>