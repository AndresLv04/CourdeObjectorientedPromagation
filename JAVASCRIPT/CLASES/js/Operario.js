

class Operario extends Trabajador{

    static VALOR_HORAS = 12000.0;
    constructor(id, nombre, area, horas){
        super(id, nombre, area);
        this.area = area;
    }
    

    get horas(){
        return this._horas;
    }

    salario(){
        return VALOR_HORAS * this.horas;
    }
}