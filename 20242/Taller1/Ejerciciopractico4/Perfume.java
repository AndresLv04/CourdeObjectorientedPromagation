public class Perfume {
    private String nombre;
    private String marca;
    private int capacidad;
    private double precio;

    public Perfume(String nombre, String marca, int capacidad, double precio){
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public void aplicarPerfume(double cantidad){
        if (cantidad > 0 && cantidad <= capacidad) {
            capacidad -= cantidad;
            System.out.println("Se ha aplicado " + cantidad + "ml de perfume");
        }else System.out.println("Cantidad invalida.");
    }

    public double consultarCantidadRestante(){
        return capacidad;
    }

    public void ajustarPrecio(double nuevoPrecio){
        if (nuevoPrecio > 0) this.precio = nuevoPrecio;
        else System.out.println("No se permite precios negativos...");
    }
}
