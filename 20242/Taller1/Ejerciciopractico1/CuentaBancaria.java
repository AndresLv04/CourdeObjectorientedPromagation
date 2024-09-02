public class CuentaBancaria {
    
    private int numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(int numeroCuenta, double saldo, String titular){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String depositar(double cantidad){
        saldo += cantidad;

        return  "Su deposito de " + cantidad + " $ " + "fue exitoso y su saldo total es : " + saldo;
    }

    public String retirar(double cantidad){
        String mostrar = " ";
        if (saldo > cantidad) {
            saldo -= cantidad;
            mostrar = "Su retiro de: " + cantidad +  " fue exitoso y ahora su saldo es: " + saldo;
        }else{
            mostrar = "Su retiro de: " + cantidad + " fue rechazado. Saldo insufiente...";
        }
        return mostrar;
    } 

    public void consultarSaldo (){
        System.out.println("Su saldo es: " + saldo);
    }
    
    public String toString(){
        return "Cuenta bancaria : Numero de cuenta: " + numeroCuenta + " Saldo: " + saldo + " titular " + titular; 
    }

}
