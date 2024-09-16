/**
 * Ejecutar
 */
public class Ejecutar {

    public static void main(String[] args) {
        
        //Creación de los objetos

        Trabajador objT1 = new Vendedor(1,"Alejandro", "Caja", 20.0);
        Trabajador objT2 = new Vendedor(2, "Jesus", "Electrodomésticos", 20.0);
        Trabajador objT3 = new Operario(3, "Andres", "Dulceria", 200.0);
        Trabajador objT4 = new Operario(4, "Lionel", "Comestibles", 230.0);

        System.out.println("Salario vendedor: " + objT1.salario());
        System.out.println("Salario operario: " + objT3.salario());

        System.out.println(objT1 instanceof Vendedor); //Para validar el objeto
        System.out.println(objT1 instanceof Trabajador);

        Trabajador[] t = new Trabajador[4];

        t[0] = objT1;
        t[1] = objT3;
        t[2] = objT2;
        t[3] = objT4;

        for (Trabajador trabajador : t) {
            System.out.println(trabajador.getClass()+ "- " + trabajador.getNombre() + " " + trabajador.salario());
        }


    }
}