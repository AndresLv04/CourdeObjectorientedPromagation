import java.util.Scanner;

public class Ejercutar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Nombre del titular: ");
        String titular = in.nextLine();

        System.out.println("Escriba su numero de cuenta: ");
        int cuentaBancaria = in.nextInt();

        CuentaBancaria objCuenta = new CuentaBancaria(cuentaBancaria, 4.0, titular);

        System.out.println("Bienvenido " + titular);

        System.out.println(titular + " ¿Que quires realizar?");
        System.out.println("1. Saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Salir");

        int option;

        option = in.nextInt();

        while (option != 4) {
            
            switch (option) {
                case 1:
                    objCuenta.consultarSaldo();
                    break;
    
                case 2:
                    System.out.println("¿Cuanto desea depositar?");
                    double depositar = in.nextDouble();
                    System.out.println(objCuenta.depositar(depositar));
                    break;
                
                case 3:
                    System.out.println("¿Cuanto desea retirar?");
                    double retirar = in.nextDouble();
                    System.out.println(objCuenta.retirar(retirar));
                    break;
    
                default:
                    break;
            }
            System.out.println("¿Que mas deseas realizar");
            option = in.nextInt();
        
            
        }
        System.out.println("Muchas gracias por utilizar nuestros servicios");
        
        in.close();
    }
        
}
