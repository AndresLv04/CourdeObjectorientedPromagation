public class Ejecutar {
    public static void main(String[] args) {
        Perfume objPerfume1 = new Perfume("Eterna", "Dior", 250, 200000);
        objPerfume1.aplicarPerfume(23.5);
        
        System.out.println("Te queda del perfume " + objPerfume1.getNombre() + ": "+ objPerfume1.consultarCantidadRestante() + " ml");
        objPerfume1.ajustarPrecio(100000.0);
        
    }
}
