<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <g:link uri="/" class="navbar-brand">Biblio</g:link>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><g:link uri="/">Hjem</g:link> </li>
                <g:if test="${session.userId}">
                    <li><a href="#">${session.userId}</a></li>
                    <li><g:link controller="login" action="logout">Logout</g:link> </li>
                </g:if>
                <g:else>
                    <li><a href="#">Registrer</a></li>
                    <li><g:link controller="login" action="login">Login</g:link> </li>
                </g:else>

                <li><g:link controller="user">Brugere</g:link></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
