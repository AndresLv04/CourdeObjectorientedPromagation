/**
 * Producto
 */
public class Producto {

    private String nombreProducto;
    private String codigo;
    private int cantidadStock;
    private int precio;


    public Producto(String nombreProducto, String codigo, int cantidadStock,int precio){

        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.cantidadStock = cantidadStock;
        this.precio = precio;
    }

    public String anadirStock(int cantidad){
        cantidadStock += cantidad;
        return "Se añadido stock de "+ cantidad + " " + nombreProducto;
    }

    public String reducirStock(int cantidad){
        cantidadStock -= cantidad;
        return "Se reducio stock de " + cantidad + " " + nombreProducto;
    }

    public void calcularValorInventario(){
        int valor = cantidadStock * precio;
        System.out.println("El valor del inventario de " + nombreProducto + " es: " + valor + " $"); 
    }
    
} 