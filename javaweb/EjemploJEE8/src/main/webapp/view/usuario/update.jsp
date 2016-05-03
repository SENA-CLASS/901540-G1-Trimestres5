<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-edit fa-fw"></i> <b> Update Usuario</b></h5> 
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form role="form" action="${appPath}/usuario/update" method="POST">
                                <div class="form-group">
                                    <label for="cuentaTipoDocumentotipodocumento">Cuenta Tipo Documentotipodocumento</label>
                                    <input class="form-control" type="text" name="cuentaTipoDocumentotipodocumento" readonly value="${USUARIO.cuentaTipoDocumentotipodocumento}" />
                                </div>     
                                <div class="form-group">
                                    <label for="cuentanumeroDocumento">Cuentanumero Documento</label>
                                    <input class="form-control" type="text" name="cuentanumeroDocumento" readonly value="${USUARIO.cuentanumeroDocumento}" />
                                </div>     
                                <div class="form-group">
                                    <label for="pass">Pass</label>
                                    <input class="form-control" type="text" name="pass"  value="${USUARIO.pass}" />
                                </div>     
                                <div class="form-group">
                                    <label for="rol">Rol</label>
                                    <input class="form-control" type="text" name="rol"  value="${USUARIO.rol}" />
                                </div>     
                                <div class="form-group">
                                    <label for="estado">Estado</label>
                                    <input class="form-control" type="text" name="estado"  value="${USUARIO.estado}" />
                                </div>     
                                <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Update</button>
                                <a href="${appPath}/usuario/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
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
