function areaCuadrado(){
    let lado = document.getElementById("input_ejercicio1").value;
    let areaTotal = lado * lado;
    document.getElementById("input_resultado1").innerHTML = areaTotal;
}

function areaCirculo(){
    const PI = 3.1416;
    let radio = document.getElementById("input_ejercicio2").value;
    let areaTotal = PI*Math.pow(radio,2);
    document.getElementById("input_resultado2").innerHTML = areaTotal;
}