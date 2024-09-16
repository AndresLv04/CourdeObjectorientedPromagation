public class Vendedor extends Trabajador{

    private double comision;
    public final double ventas = 120000.0;

    public Vendedor(int id, String nombre, String area, double comision){
        super(id, nombre, area);
        this.comision = comision;

    }
    
    public double getComision(){
        return comision;
    }

    public double salario(){
        return (ventas * (comision/100)) + ventas;
    }
}