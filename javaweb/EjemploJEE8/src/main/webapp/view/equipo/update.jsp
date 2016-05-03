<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-edit fa-fw"></i> <b> Update Equipo</b></h5> 
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form role="form" action="${appPath}/equipo/update" method="POST">
                                <div class="form-group">
                                    <label for="serial">Serial</label>
                                    <input class="form-control" type="text" name="serial" readonly value="${EQUIPO.serial}" />
                                </div>     
                                <div class="form-group">
                                    <label for="marca">Marca</label>
                                    <input class="form-control" type="text" name="marca"  value="${EQUIPO.marca}" />
                                </div>     
                                <div class="form-group">
                                    <label for="descripcion">Descripcion</label>
                                    <input class="form-control" type="text" name="descripcion"  value="${EQUIPO.descripcion}" />
                                </div>     
                                <div class="form-group">
                                    <label for="estado">Estado</label>
                                    <input class="form-control" type="text" name="estado"  value="${EQUIPO.estado}" />
                                </div>     
                                <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Update</button>
                                <a href="${appPath}/equipo/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
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
