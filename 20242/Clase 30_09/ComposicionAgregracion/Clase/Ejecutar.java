public class Ejecutar {
    public static void main(String[] args) {
        
        Cliente objCliente1 = new Cliente(123456789, "Andres", "Lopez");

        Cuenta objCuenta1 = new Cuenta("709876","Ahorros",0.0);

        Banco objBanco1 = new Banco("09922344", "Banco UCC", objCuenta1);

        System.out.println(objBanco1);
        System.out.println(objBanco1.esCliente(objCliente1));
    }
}
