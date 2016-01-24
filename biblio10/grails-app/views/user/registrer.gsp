<%--
  Created by IntelliJ IDEA.
  User: nielsbechnielsen
  Date: 24/01/2016
  Time: 14.53
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="biblio" />
    <title>Opret ny profil</title>
</head>

<body>

<h1>Registrer ny bruger</h1>
<g:hasErrors>
    <div class="alert alert-danger alert-dismissable">
        <g:renderErrors bean="${user}" as="list"/>
    </div>
</g:hasErrors>

<g:form action="newUser" role="form">
    <div class="form-group">
        <label for="loginId">Username:</label>
        <g:textField name="loginId" value="${user?.loginId}"></g:textField>
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <g:passwordField name="password"></g:passwordField>
    </div>
    <div class="form-group">
        <label for="repeatPassword">Password:</label>
        <g:passwordField name="repeatPassword"></g:passwordField>
    </div>
    <div class="form-group">
        <label for="fullname">Full name:</label>
        <g:textField name="fullname" value="${user?.fullname}"></g:textField>
    </div>
    <div class="form-group">
        <label for="email">Email:</label>
        <g:textField name="email" value="${user?.email}"></g:textField>
    </div>
    <div class="form-group">
        <label for="bio">Biography:</label>
        <g:textArea name="bio" value="${user.bio}" />
    </div>
    <g:submitButton name="submit" value="Opret" class="btn btn-primary"/>
</g:form>


</body>
</html>