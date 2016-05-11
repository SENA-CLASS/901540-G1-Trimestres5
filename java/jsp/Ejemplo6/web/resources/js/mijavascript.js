function validacion() {
    valor = document.getElementById("num2").value;
    if (isNaN(valor)) {
        alert("no es valido");
        return false;
    }
    valor = document.getElementById("num1").value;
    if (isNaN(valor)) {
        alert("no es valido");
        return false;
    }
    return true;
}

