public class Cuenta {
    

    private String nroCuenta;
    private String tipoCuenta;
    private double Saldo;

    
    public Cuenta(String nroCuenta, String tipoCuenta, double Saldo) {
        this.nroCuenta = nroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.Saldo = Saldo;
    }


    public String getNroCuenta() {
        return nroCuenta;
    }


    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }


    public String getTipoCuenta() {
        return tipoCuenta;
    }


    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    public double getSaldo() {
        return Saldo;
    }


    public void setSaldo(double saldo) {
        Saldo = saldo;
    }


    @Override
    public String toString() {
        return "Cuenta [nroCuenta=" + nroCuenta + ", tipoCuenta=" + tipoCuenta + "]";
    }


    
}
