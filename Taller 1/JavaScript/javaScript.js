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

function grados(){

    if (document.getElementById("tipo_option").value == "CaF") {
        let gC = document.getElementById("input_ejercicio3").value;
        let convertirG = ((9/5) * gC) + 32;
        document.getElementById("input_resultado3").innerHTML = convertirG + " grados °F";
    }if (document.getElementById("tipo_option").value == "FaC") {
        let gF = document.getElementById("input_ejercicio3").value;
        let convertirF = (gF - 32)/(9/5);
        document.getElementById("input_resultado3").innerHTML = convertirF.toFixed(3) + " grados °C"
    } else {
        
    }
}