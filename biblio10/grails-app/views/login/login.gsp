<%--
  Created by IntelliJ IDEA.
  User: nielsbechnielsen
  Date: 24/01/2016
  Time: 12.18
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="biblio" />
    <title>Login</title>
</head>

<body>

  <h1>Login</h1>



<g:form name="login" action="doLogin">
    <div class="form-group">
      <label for="userId">Username:</label>
      <g:textField name="userId"></g:textField>
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <g:passwordField name="password"></g:passwordField>
    </div>
    <g:submitButton name="submit" value="Login" class="btn btn-primary"/>
</g:form>
</body>
</html>