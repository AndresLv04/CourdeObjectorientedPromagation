class Cliente {

    #cedula;
    #nombre;
    #apellido;

    constructor(cedula,nombre,apellido) {
        this.#cedula = cedula;
        this.#nombre = nombre;
        this.#apellido = apellido;
    }

    getCedula(){
        return this.#cedula;
    }

    setCedula(cedula){
        this.#cedula = cedula;
    }

    getNombre(){
        return this.#nombre;
    }

    setNombre(nombre){
        this.#nombre = nombre;
    }

    getApellido(){
        return this.#apellido;
    }

    setApellido(apellido){
        this.#apellido = apellido;
    }

    toString(){
        return `Cliente [cedula = ${this.#cedula}, nombre = ${this.#nombre}, apellido = ${this.#apellido}]`;
    }
}

export default Cliente;