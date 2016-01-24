<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="biblio">
    <title>Bruger liste</title>
</head>

<body>

    <h2>Brugere (ialt ${userInstanceCount})</h2>


<g:render template="table" model="[userList:userInstanceList, linkToReview: true]"/>

<g:link action="create" class="btn btn-primary">Opret ny bruger</g:link>
<g:link uri="/" class="btn btn-default">Home</g:link>



</body>
</html>