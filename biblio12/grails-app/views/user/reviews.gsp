<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="biblio"/>
    <title>Bruger reviews</title>
</head>

<body>


<h1>Reviews af ${user?.profile?.fullname ?: user.loginId}</h1>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Date</th>
        <th>Book</th>
        <th>Review</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${reviews}" var="review">
        <tr>
            <td><g:formatDate format="yyyy-MM-dd HH:mm" date="${review.dateCreated}"/> </td>
            <td>${ review.book.title}</td>
            <td><fun:clip text="${review.text}" size="40"/></td>
        </tr>
    </g:each>

    </tbody>
</table>


<h3>Write your own review</h3>

<g:form action="newReview" role="form" >
    <g:hiddenField name="userId" value="${user.id}" />
    <div class="form-group">
        <label for="bookId">Select book:</label>
        <g:select name="bookId" from="${books}" optionKey="id" optionValue="title" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="review">Write review:</label>
        <g:textArea name="review" rows="10" cols="20" class="form-control"></g:textArea>
    </div>
    <g:submitButton name="submit" value="Indsend review" class="btn btn-primary"/>
</g:form>

</body>
