<%--
  Created by IntelliJ IDEA.
  User: nielsbechnielsen
  Date: 24/01/2016
  Time: 11.46
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="biblio">
    <title>Alle bøger</title>
</head>

<body>

<h2>Bøger</h2>

<div class="panel-group" >
    <g:each in="${sections}" var="section">
    <div class="panel panel-default">

        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse"  href="#collapse${section.sectionId}">
                    ${section.sectionId} - ${section.description}   <span class="badge">${section.books.size()}</span> </a>
            </h4>
        </div>
        <div id="collapse${section.sectionId}" class="panel-collapse collapse">
            <div class="panel-body">

                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>ISBN</th>
                        <th>Bog</th>
                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${section.books}" var="book">
                        <tr>
                            <td>${book.isbn}</td>
                            <td>${book.title}</td>
                        </tr>
                    </g:each>

                    </tbody>
                </table>
            </div>
        </div>
    </div>

    </g:each>
</div>

</body>
</html>