<%--
  Created by IntelliJ IDEA.
  User: nielsbechnielsen
  Date: 09/01/2016
  Time: 18.42
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

  <h1>Pig Latin</h1>

  <p>The quick brown fox jumps over the lazy dog</p>

  <p><pig:latinize>The quick brown fox jumps over the lazy dog</pig:latinize></p>

  <h2>Lorum Ipsum as Pig Latin</h2>

<p>
  <pig:latinize>
      Lorem ipsum dolor sit amet, consectetur adipiscing elit.
      Pellentesque lobortis odio justo, sed dapibus purus hendrerit ac.
      Nunc turpis ligula, convallis vulputate euismod ac, venenatis vel mauris.
      Fusce eleifend tellus iaculis, luctus mi id, placerat ligula.
      Curabitur eget mauris sed massa elementum bibendum. Vestibulum ac aliquam odio, a scelerisque dolor.
      Donec metus nulla, maximus sed faucibus at, venenatis eget turpis.
      Praesent quis rhoncus tortor, vel blandit nibh</pig:latinize>
</p>

</body>
</html>