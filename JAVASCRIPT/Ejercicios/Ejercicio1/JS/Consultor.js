import Trabajador from "./Trabajador.js";

class Consultor extends Trabajador {

    
    constructor(nombres,apellidos,experiencia,telefono,id) {
        super(nombres,apellidos,experiencia,telefono,id);
        this._Pcomision = 15;
        this.SALARIO_BASICO = 1000000;
    }
    
    get getComision(){
        return this._comision;
    }

    pagar(){
        let consultas = prompt("¿Cuantas consultas realizó?")
        let tComision = consultas * (this._Pcomision/100);
        let tPagar = tComision + this.SALARIO_BASICO;
        
        return  tPagar;
    }
}

export default Consultor;