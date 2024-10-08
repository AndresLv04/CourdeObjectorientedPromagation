public class Banco {


    //Atributos
    private String NIT;
    private String razonSocial;
    private Cuenta cuenta;


    //Constructor
    public Banco(String nIT, String razonSocial, Cuenta cuenta) {
        this.NIT = nIT;
        this.razonSocial = razonSocial;
        this.cuenta = cuenta;
    }

    //Getter y setter
    public String getNIT() {
        return NIT;
    }


    public void setNIT(String nIT) {
        this.NIT = nIT;
    }


    public String getRazonSocial() {
        return razonSocial;
    }


    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }


    public Cuenta getCuenta() {
        return cuenta;
    }


    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Banco [NIT=" + NIT + ", razonSocial=" + razonSocial + ", cuenta=" + cuenta + "]";
    }

    public boolean esCliente(Cliente cliente){
        boolean flag = false;
        if (cliente instanceof Cliente) {
            flag = true;
        }
        return flag; 
    }
    
    


    
}