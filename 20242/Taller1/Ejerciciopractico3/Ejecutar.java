public class Ejecutar {
    public static void main(String[] args) {
        
        Producto jabon = new Producto("Jabones", "8982-2343-4221", 5, 2150);
    
        System.out.println(jabon.anadirStock(5));
        System.out.println(jabon.reducirStock(4));
        jabon.calcularValorInventario();
    }
    
}