import Cuenta from "./Cuenta.js";
import Cliente from "./Cliente.js"

class Banco {

    #NIT;
    #razonSocial;
    #cuenta;

    constructor(NIT, razonSocial,cuenta) {
        this.#NIT = NIT;
        this.#razonSocial = razonSocial;
        this.#cuenta = cuenta;
    }

    getNIT(){
        return this.#NIT;
    }

    setNIT(NIT){
        this.#NIT = NIT;
    }


    getRazonSocial(){
        return this.#razonSocial;
    }

    setRazonSocial(razonSocial){
        this.#razonSocial = razonSocial;
    }

    getCuenta(){
        return this.#cuenta;
    }

    setCuenta(cuenta){
        this.#cuenta = cuenta;
    }
    
    esCliente(cliente) {
        return cliente instanceof Cliente; // Comprobación de instancia
    }


    consignarDinero(monto) {
        return this.#cuenta.consignarMsg(this.#cuenta.getNroCuenta(), monto);
    }
    

    toString(){
        return `Banco [NIT= ${this.#NIT}, razon Social = ${this.#razonSocial}, cuenta = ${this.#cuenta}]`
    }

    esCliente(cliente){
        let flag = false;
        if (cliente instanceof Cliente) {
            flag = true;
        }
        return flag; 
    }

}

export default Banco;