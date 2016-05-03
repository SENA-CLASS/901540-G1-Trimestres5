<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-plus-square fa-fw"></i> <b> Create a new Cuenta </b></h5>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form role="form" action="${appPath}/cuenta/new" method="POST">
                                <div class="form-group">
                                    <label for="tipoDocumentotipodocumento">Tipo Documentotipodocumento</label>
                                    <input class="form-control" type="text" name="tipoDocumentotipodocumento" path="tipoDocumentotipodocumento"  required="required" autofocus="autofocus"  />
                                </div>
                                <div class="form-group">
                                    <label for="numeroDocumento">Numero Documento</label>
                                    <input class="form-control" type="text" name="numeroDocumento" path="numeroDocumento"  required="required" autofocus="autofocus"  />
                                </div>
                                <div class="form-group">
                                    <label for="primerNombre">Primer Nombre</label>
                                    <input class="form-control" type="text" name="primerNombre" path="primerNombre"  />
                                </div>
                                <div class="form-group">
                                    <label for="segundoNombre">Segundo Nombre</label>
                                    <input class="form-control" type="text" name="segundoNombre" path="segundoNombre"  />
                                </div>
                                <div class="form-group">
                                    <label for="primerApellido">Primer Apellido</label>
                                    <input class="form-control" type="text" name="primerApellido" path="primerApellido"  />
                                </div>
                                <div class="form-group">
                                    <label for="segundoApellido">Segundo Apellido</label>
                                    <input class="form-control" type="text" name="segundoApellido" path="segundoApellido"  />
                                </div>
                                <div class="form-group">
                                    <label for="fechaTerminacion">Fecha Terminacion</label>
                                    <input class="form-control" type="date" name="fechaTerminacion" path="fechaTerminacion"  />
                                </div>
                                <div class="form-group">
                                    <label for="estado">Estado</label>
                                    <input class="form-control" type="text" name="estado" path="estado"  />
                                </div>
                                <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Submit</button>
                                <a href="${appPath}/cuenta/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
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
