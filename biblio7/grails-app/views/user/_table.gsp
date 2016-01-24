<!--
    # args - userList - List of users
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
            <td>${user.loginId}</td>
            <td><fun:toCamelcase>${user.profile?.fullname}</fun:toCamelcase></td>
            <td>${user.profile?.email}</td>
            <td><span class="badge">${user.borrows.size()}</span></td>
        </tr>
    </g:each>
    </tbody>
</table>
