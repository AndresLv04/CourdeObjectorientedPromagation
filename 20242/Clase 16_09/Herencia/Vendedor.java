public class Vendedor extends Trabajador{

    private int comision;
    public final double ventas = 120000.0;

    public Vendedor(int id, String nombre, String area, int comision){
        super(id, nombre, area);
        this.comision = comision;

    }
    
    public double comision(){
        return comision;
    }

    public double salario(){
        return ventas * 1.20;
    }
}