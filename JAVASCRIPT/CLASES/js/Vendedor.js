class Vendedor extends Trabajador{

    static VENTAS = 120000.0;
    constructor(id, nombre, area, comision){
        super(id, nombre, area);
        this.comision = comision;
    }
    

    getComision(){
        return this._comision;
    }

    salario(){
        return (ventas * (comision/100)) + ventas;
    }
}