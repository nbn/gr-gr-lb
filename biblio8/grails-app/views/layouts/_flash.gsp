<g:if test="${flash?.message}">
    <div class="alert alert-success">
        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        <strong>Success!</strong> ${flash.message}.
    </div>
</g:if>
<g:if test="${flash?.error}">
    <div class="alert alert-danger">
        <strong>Danger!</strong> ${flash.error}.
    </div>
</g:if>
