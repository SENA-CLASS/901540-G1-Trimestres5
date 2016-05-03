<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-edit fa-fw"></i> <b> Update Log Aplicacion</b></h5> 
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form role="form" action="${appPath}/logAplicacion/update" method="POST">
                                <input type="hidden" name="idlogAplicacion" value="${LOG_APLICACION.idlogAplicacion}" />
                                <div class="form-group">
                                    <label for="nivel">Nivel</label>
                                    <input class="form-control" type="text" name="nivel"  value="${LOG_APLICACION.nivel}" />
                                </div>     
                                <div class="form-group">
                                    <label for="mensaje">Mensaje</label>
                                    <input class="form-control" type="text" name="mensaje"  value="${LOG_APLICACION.mensaje}" />
                                </div>     
                                <div class="form-group">
                                    <label for="log">Log</label>
                                    <input class="form-control" type="text" name="log"  value="${LOG_APLICACION.log}" />
                                </div>     
                                <div class="form-group">
                                    <label for="hora">Hora</label>
                                    <input class="form-control" type="date" name="hora"  value="${LOG_APLICACION.hora}" />
                                </div>     
                                <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Update</button>
                                <a href="${appPath}/logAplicacion/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
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
