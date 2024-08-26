public class Marcador {

    private String nombre;      
    private String color;
    private double diametro;
    private boolean esBorrable;

    public Marcador(String nombre, String color, double diametro, boolean esBorrable){
        this.nombre = nombre;
        this.color = color;
        this.diametro = diametro;
        this.esBorrable = esBorrable;

    }

    //Métodos de la clase
    
    /*
     * Firma del método
     * publico
     * el nombre del método es "rayar"
     * no retorna valores
     * No recibeparametros
     */
    
    public void rayar(){
        System.out.println("Marcador rayando");
    }


    /*
     * Firma del método
     * publico
     * el nombre del método es "recargar"
     * retorna un valor tipo String
     * Recibe 1 parámetro o argumento de tipo real(double)
     */

    public String recargar(double cantidad){
        return "El marcador se recargo con " + cantidad + "ml";
    }

    public String toString(){
        return "{Marcador : Nombre: " + nombre + " Color: " + color + " Diametro: " + diametro + " esBorrable: " + esBorrable+ " }"; 
    }


}