<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h5><i class="fa fa-plus-square fa-fw"></i> <b> Create a new Cargo </b></h5>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form role="form" action="${appPath}/cargo/new" method="POST">
                                <div class="form-group">
                                    <label for="idCargo">Id Cargo</label>
                                    <input class="form-control" type="text" name="idCargo" path="idCargo"  required="required" autofocus="autofocus"  />
                                </div>
                                <div class="form-group">
                                    <label for="descripcionCargo">Descripcion Cargo</label>
                                    <input class="form-control" type="text" name="descripcionCargo" path="descripcionCargo"  />
                                </div>
                                <div class="form-group">
                                    <label for="estado">Estado</label>
                                    <input class="form-control" type="text" name="estado" path="estado"  />
                                </div>
                                <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Submit</button>
                                <a href="${appPath}/cargo/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
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
