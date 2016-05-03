<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-plus-square fa-fw"></i> <b> Create a new Log Aplicacion </b></h5>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form role="form" action="${appPath}/logAplicacion/new" method="POST">
                                <div class="form-group">
                                    <label for="nivel">Nivel</label>
                                    <input class="form-control" type="text" name="nivel" path="nivel"  />
                                </div>
                                <div class="form-group">
                                    <label for="mensaje">Mensaje</label>
                                    <input class="form-control" type="text" name="mensaje" path="mensaje"  />
                                </div>
                                <div class="form-group">
                                    <label for="log">Log</label>
                                    <input class="form-control" type="text" name="log" path="log"  />
                                </div>
                                <div class="form-group">
                                    <label for="hora">Hora</label>
                                    <input class="form-control" type="date" name="hora" path="hora"  />
                                </div>
                                <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Submit</button>
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
