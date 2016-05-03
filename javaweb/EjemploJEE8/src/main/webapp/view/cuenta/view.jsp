<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-info-circle fa-fw"></i> <b> Cuenta info</b></h5> 
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="list-group">

                                <a href="#" class="list-group-item">
                                    <div class="row">
                                        <div class="col-lg-4"><span class="small">Tipo Documentotipodocumento :</span></div>
                                        <div class="col-lg-8">${CUENTA.tipoDocumentotipodocumento}</div>
                                    </div>
                                </a>             
                                <a href="#" class="list-group-item">
                                    <div class="row">
                                        <div class="col-lg-4"><span class="small">Numero Documento :</span></div>
                                        <div class="col-lg-8">${CUENTA.numeroDocumento}</div>
                                    </div>
                                </a>             
                                <a href="#" class="list-group-item">
                                    <div class="row">
                                        <div class="col-lg-4"><span class="small">Primer Nombre :</span></div>
                                        <div class="col-lg-8">${CUENTA.primerNombre}</div>
                                    </div>
                                </a>             
                                <a href="#" class="list-group-item">
                                    <div class="row">
                                        <div class="col-lg-4"><span class="small">Segundo Nombre :</span></div>
                                        <div class="col-lg-8">${CUENTA.segundoNombre}</div>
                                    </div>
                                </a>             
                                <a href="#" class="list-group-item">
                                    <div class="row">
                                        <div class="col-lg-4"><span class="small">Primer Apellido :</span></div>
                                        <div class="col-lg-8">${CUENTA.primerApellido}</div>
                                    </div>
                                </a>             
                                <a href="#" class="list-group-item">
                                    <div class="row">
                                        <div class="col-lg-4"><span class="small">Segundo Apellido :</span></div>
                                        <div class="col-lg-8">${CUENTA.segundoApellido}</div>
                                    </div>
                                </a>             
                                <a href="#" class="list-group-item">
                                    <div class="row">
                                        <div class="col-lg-4"><span class="small">Fecha Terminacion :</span></div>
                                        <div class="col-lg-8">${CUENTA.fechaTerminacion}</div>
                                    </div>
                                </a>             
                                <a href="#" class="list-group-item">
                                    <div class="row">
                                        <div class="col-lg-4"><span class="small">Estado :</span></div>
                                        <div class="col-lg-8">${CUENTA.estado}</div>
                                    </div>
                                </a>             

                            </div>
                            <a href="${appPath}/cuenta/list" class="btn btn-default"><i class="fa fa-arrow-circle-left fa-fw"></i>Back</a>
                        </div>
                        <!-- /.col-lg-6 (nested) -->
                    </div>
                    <!-- /.row (nested) -->
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
</div>
<!-- /#page-wrapper -->
</div>

<%--end content--%>
<%@ include file="../common/footer.jspf"%>
