class Cuenta {

    #nroCuenta;
    #tipoCuenta;
    #saldo;

    constructor(nroCuenta, tipoCuenta, saldo) {
        this.#nroCuenta = nroCuenta;
        this.#tipoCuenta = tipoCuenta;
        this.#saldo = saldo;
    }

    getNroCuenta(){
        return this.#nroCuenta;
    }

    setNroCuenta(nroCuenta){
        this.#nroCuenta = nroCuenta;
    }

    getTipoCuenta(){
        return this.#tipoCuenta;
    }
    
    setTipoCuenta(tipoCuenta){
        this.#tipoCuenta = tipoCuenta;
    }

    getSaldo(){
        return this.#saldo;
    }

    setSaldo(saldo){
        this.#saldo = saldo;
    }

    toString(){
        return `Cuenta [numero de cuenta: ${this.#nroCuenta}, tipo Cuenta: ${this.#tipoCuenta}. saldo: ${this.#saldo}]`;
    }

    consignar(nroCuenta, monto){
        let flag = false;
        
        if (nroCuenta === "1234") {
            this.#saldo += monto;
            flag = true;
        }
        return flag;
    }

    consignarMsg(nroCuenta,monto){
        let msg = "";
        if (nroCuenta === "1234") {
            this.#saldo += monto;
            msg = "Transacción exitosa...." + "saldo actual: " + this.#saldo;
        }else{
            msg = "Error en la transacción..."
        }

        return msg;
    }
}

export default Cuenta;