class Trabajador {
    constructor(nombres,apellidos,experiencia,telefono,id) {
        this._nombre = nombres;
        this._apellidos = apellidos;
        this._experiencia = experiencia;
        this._telefono = telefono;
        this._id = id;
    }

    get getNombres(){
        return this._nombre;
    }

    get getApellidos(){
        return this._apellidos;
    }

    get getExperiencia(){
        return this._experiencia;
    }

    get getTelefono(){
        return this._experiencia;
    }

    get getId(){
        return this._id;
    }

    pagar(){
        return 0.0;
    }
}

export default Trabajador;