function areaCuadrado(){
    let lado = document.getElementById("input_ejercicio1").value;
    let areaTotal = lado * lado;
    document.getElementById("input_resultado1").innerHTML = areaTotal;
}