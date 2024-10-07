class Nomina {
    constructor(trabajadores) {

        this._trabajadores = trabajadores;
    }

    generarPagos(){
        for (let i = 0; i < this._trabajadores.length; i++) {
            console.log(`${this._trabajadores[i].constructor.name} ${this._trabajadores[i]. getNombres} pago generado: ${this._trabajadores[i].pagar()}`);
        }
    }
    

    /*mostrarNomina(){
        for (let i = 0; i < this._trabajadores.length; i++) {
            console.log(this._trabajadores[i]);
            
        }
        
    }*/
}

export default Nomina;