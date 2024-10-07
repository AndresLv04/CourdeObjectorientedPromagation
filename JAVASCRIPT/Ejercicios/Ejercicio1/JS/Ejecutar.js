import Trabajador from "./Trabajador.js";
import Consultor from "./Consultor.js";
import Operario from "./Operario.js";
import Nomina from "./Nomina.js";

class Ejecutar {
    constructor() {
        const objConsulto1 = new Consultor("Andres","Lopez",5,"314-657-1345",855225);
        console.log(objConsulto1.pagar());

        const objOperario1 = new Operario("Alejandro","Mosquera",2,"323-345-7875",78232);
        console.log(objOperario1.pagar())

        const objNomina = new Nomina()
        
        objNomina.generarPagos();
        
        
    }
}

new Ejecutar();