<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-plus-square fa-fw"></i> <b> Create a new Propietario </b></h5>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form role="form" action="${appPath}/propietario/new" method="POST">
                                <div class="form-group">
                                    <label for="equipoSerial">Equipo Serial</label>
                                    <input class="form-control" type="text" name="equipoSerial" path="equipoSerial"  required="required" autofocus="autofocus"  />
                                </div>
                                <div class="form-group">
                                    <label for="cuentaTipoDocumentotipodocumento">Cuenta Tipo Documentotipodocumento</label>
                                    <input class="form-control" type="text" name="cuentaTipoDocumentotipodocumento" path="cuentaTipoDocumentotipodocumento"  required="required" autofocus="autofocus"  />
                                </div>
                                <div class="form-group">
                                    <label for="cuentanumeroDocumento">Cuentanumero Documento</label>
                                    <input class="form-control" type="text" name="cuentanumeroDocumento" path="cuentanumeroDocumento"  required="required" autofocus="autofocus"  />
                                </div>
                                <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Submit</button>
                                <a href="${appPath}/propietario/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

<%--end content--%>
<%@ include file="../common/footer.jspf"%>
