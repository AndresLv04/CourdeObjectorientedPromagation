public class Operario extends Trabajador {

    
    public final double VALOR_HORAS;
    private double horas;

    public Operario(int id, String nombre, String area, double horas){
        super(id,nombre,area);
        this.horas = horas;
    }

    
}