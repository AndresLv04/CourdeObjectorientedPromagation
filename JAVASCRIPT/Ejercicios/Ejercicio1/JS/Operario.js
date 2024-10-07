import Trabajador from "./Trabajador.js";

class Operario extends Trabajador {
    constructor(nombres,apellidos,experiencia,telefono,id) {
        super(nombres,apellidos,experiencia,telefono,id);
        this._valorHora = 10000;
    }

    pagar(){
        let horas = prompt("¿Cuantas horas trabajaste?:")
        let tPagar = horas * this._valorHora;
        return `Operario: ${this.getNombres} su salario es: ${tPagar}`;
    }
}

export default Operario;