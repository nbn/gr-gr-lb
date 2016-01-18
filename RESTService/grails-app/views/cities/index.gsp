<%--
  Created by IntelliJ IDEA.
  User: nielsbechnielsen
  Date: 18/01/2016
  Time: 20.18
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

<p>The citites are</p>
<ul>
    <g:each in="${cities}" var="city">
        <li>${city.postnummer} - ${city.bynavn} (${city.landekode})</li>
    </g:each>
</ul>

</body>
</html>