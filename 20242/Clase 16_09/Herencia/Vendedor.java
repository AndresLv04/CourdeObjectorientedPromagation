public class Vendedor extends Trabajador{

    private double comision;
    public final double ventas = 120000.0;

    public Vendedor(int id, String nombre, String area, double d){
        super(id, nombre, area);
        this.comision = d;

    }
    
    public double comision(){
        return comision;
    }

    public double salario(){
        return (ventas * (comision/100)) + ventas;
    }
}