import Banco from "./Banco.js";
import Cliente from "./Cliente.js"
import Cuenta from "./Cuenta.js"

class Ejecutar {
    constructor() {
        
        const objCliente1 = new Cliente(123443, "Andres", "Lopez");
        const objCuenta1 = new Cuenta("1234","Ahorros",0.0);
        const objBanco1 = new Banco("12223","Banco UCC",objCuenta1);

        console.log(objBanco1.toString());
        console.log(objBanco1.esCliente(objCliente1));
        
        
        //console.log(objCuenta1.consignar(objCuenta1.getNroCuenta(), 140000.0))
        console.log(objCuenta1.consignarMsg(objCuenta1.getNroCuenta(), 120000.0));
        console.log(objCuenta1.toString());

        console.log(objBanco1.consignarDinero(12200));
        
        
    }
}

new Ejecutar();