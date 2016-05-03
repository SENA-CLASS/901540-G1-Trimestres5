<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-edit fa-fw"></i> <b> Update Tipo Documento</b></h5> 
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form role="form" action="${appPath}/tipoDocumento/update" method="POST">
                                <div class="form-group">
                                    <label for="tipoDocumento">Tipo Documento</label>
                                    <input class="form-control" type="text" name="tipoDocumento" readonly value="${TIPO_DOCUMENTO.tipoDocumento}" />
                                </div>     
                                <div class="form-group">
                                    <label for="descripcion">Descripcion</label>
                                    <input class="form-control" type="text" name="descripcion"  value="${TIPO_DOCUMENTO.descripcion}" />
                                </div>     
                                <div class="form-group">
                                    <label for="estado">Estado</label>
                                    <input class="form-control" type="text" name="estado"  value="${TIPO_DOCUMENTO.estado}" />
                                </div>     
                                <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Update</button>
                                <a href="${appPath}/tipoDocumento/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
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
