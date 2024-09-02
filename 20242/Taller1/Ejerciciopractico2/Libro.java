public class Libro {
    
    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroPagina;
    private int cantidad;



    public Libro(String titulo, String autor, String iSBN, int numeroPagina, int cantidad){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = iSBN;
        this.numeroPagina = numeroPagina;
        this.cantidad = cantidad;
    }
    
    public String prestar(){
        String mostrar = " ";
        if (cantidad > 0) {
            cantidad -= 1;
            mostrar = "Prestamo exitoso";
            
        }else{
            mostrar = "El libro no esta disponible";
        }
        return mostrar;
    }
    
    public String devolver(){
        cantidad += 1;
        return "Devolución exitosa";
    }
    
    public void estaDisponible(){
        if (cantidad > 0) {
            System.out.println("El libro "+ titulo + " esta disponible: " + cantidad);
        }else{
            System.out.println("El libro "+ titulo + " no esta disponible: " + cantidad);
        }
    }

}
