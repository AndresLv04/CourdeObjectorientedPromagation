public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    
    public Producto(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Los metodos get y set
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public String toString(){
        return "Producto { id: " + id + " nombre: " + nombre + " precio: " + precio + " }";
    }
}