import Trabajador from "./Trabajador.js";

class Analista extends Trabajador {
    constructor(nombres,apellidos,experiencia,telefono,id) {
        super(nombres,apellidos,experiencia,telefono,id);
        this._BASE = 1500000.0 
    }

    pagar(){
        
        const transporte = 100000; 
        const prima = 200000;
        const cesantias = 120000;
        const salud = 150000;
    
        let prestaciones = transporte + prima + cesantias + salud;
        let salarioIntegral = this._BASE + prestaciones;

        return salarioIntegral;
    }
}
export default Analista;