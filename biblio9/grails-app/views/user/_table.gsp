<!--
    # args - userList - List of users
    #        linkToReview - Should we link on to reviews from each user?
-->

<table class="table table-striped">
    <thead>
    <tr>
        <th>Login Id</th>
        <th>Navn</th>
        <th>Email</th>
        <th>&nbsp;</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${userList}" var="user">
        <tr>
            <g:if test="${linkToReview}">
                <td>
                    <g:link controller="user" action="reviews" id="${user.loginId}">${user.loginId}</g:link>
                </td>
            </g:if>
            <g:else>
                <td>${user.loginId}</td>
            </g:else>
            <td><fun:toCamelcase>${user.profile?.fullname}</fun:toCamelcase></td>
            <td>${user.profile?.email}</td>
            <td><span class="badge">${user.borrows.size()}</span></td>
        </tr>
    </g:each>
    </tbody>
</table>
