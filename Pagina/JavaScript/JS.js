/*var nUno = prompt("Digite el primer numero: ");
var nDos = prompt("Digite el segundo numero: ");
var resta = nUno - nDos;
if (resta > 0) {
    alert("Es mayor a 0");
    if(resta % 2 == 0){
        alert("Es par");
    }else{
        alert("Es impar");
    }
}else{
    alert("El número es menor a 0");
}*/

//Ejercicio 1.
/*
1. Diseñe un algoritmo que calcule el área de un cuadrado,
   teniendo uno de sus  lados.

var b = prompt("Digite el lado del cuadrado"); //Solicitar el lado del cuadrado
var areaCuadrado = b * b; //Fórmula para hallar el área de un cuadrado
console.log("El area del cuadrado es " + areaCuadrado); //Mensaje de salida

*/

//Ejercicio 2.

/*
 * 2. Diseñe un algoritmo que calcule el área de un círculo. A = π r^2
 * Entrada: radio del círculo, PI(constante)
 * Proceso: areaCirculo = PI(r * r)
 * Salida: areaCirculo
 */

//Declaración de variables
/*let r = 0.0;
const PI = 3.1416;
let areaCirculo;

//Solicito el radio
r = prompt("Digite el radio del circulo: ");

//
areaCirculo = PI * (r*r);

//Mensaje de salida
alert("El area del circulo es " + areaCirculo);*/

//Ejercicio 3

/**
 * 3. Diseñe un algoritmo que convierta de grados centígrados a grados fahrenheit y  viceversa
 * 
 */


let opcion = prompt("1. Convertir C a F 2. Convertir F a C");

switch (opcion) {
    case "1":

        let grados = 0;

        grados = prompt("¿Cuantos grados quieres convertir a fahrenheit?")

        let Tgrados = grados * (9/5) + 32

        alert(grados + " grados"+ " es igual a: " + Tgrados + " fahrenheit");

        break;

    case "2":

        let gF = 0;

        gF = prompt("¿Cuantos fahrenheit quieres convertir a grados");

        let Tfahrenheit = (gF - 32) * (5/9);
        
        alert(gF + " fahrenheit" + " es igual a: " + Tfahrenheit + " grados");

        break;
    default:
        break;
}







