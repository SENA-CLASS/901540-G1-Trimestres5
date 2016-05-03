<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-edit fa-fw"></i> <b> Update Propietario</b></h5> 
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form role="form" action="${appPath}/propietario/update" method="POST">
                                <div class="form-group">
                                    <label for="equipoSerial">Equipo Serial</label>
                                    <input class="form-control" type="text" name="equipoSerial" readonly value="${PROPIETARIO.equipoSerial}" />
                                </div>     
                                <div class="form-group">
                                    <label for="cuentaTipoDocumentotipodocumento">Cuenta Tipo Documentotipodocumento</label>
                                    <input class="form-control" type="text" name="cuentaTipoDocumentotipodocumento" readonly value="${PROPIETARIO.cuentaTipoDocumentotipodocumento}" />
                                </div>     
                                <div class="form-group">
                                    <label for="cuentanumeroDocumento">Cuentanumero Documento</label>
                                    <input class="form-control" type="text" name="cuentanumeroDocumento" readonly value="${PROPIETARIO.cuentanumeroDocumento}" />
                                </div>     
                                <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Update</button>
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
