import java.util.ArrayList;

public class ReservarHotel {

    //Atributos
    private String cliente;
    private int numeroHabitacion;
    private String fechaEntrada;
    private String fechaSalida;

    //Almacenar reservas
    private static ArrayList<ReservarHotel> guardarReserva = new ArrayList<>();
    
    //Constructor
    public ReservarHotel(String cliente, int numeroHabitacion, String fechaEntrada, String fechaSalida){
        this.cliente = cliente;
        this.numeroHabitacion = numeroHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    //Metodo para almacenar reservas
    public static void nuevaReserva(String cliente, int numeroHabitacion, String fechaEntrada, String fechaSalida){
        ReservarHotel nuevaReserva = new ReservarHotel(cliente, numeroHabitacion, fechaEntrada, fechaSalida);
        guardarReserva.add(nuevaReserva);
        System.out.println("Su reserva señor(a): " + cliente + " se registro correctamente...");
    }

    //Metodo para cancela una reserva especificando el cliente
    public static void cancelarReserva(String nombreCliente){
        boolean existe = false;
        for (ReservarHotel reservarHotel : guardarReserva) {
            if (reservarHotel.cliente.equalsIgnoreCase(nombreCliente)) {
                existe = true;
                guardarReserva.remove(reservarHotel);
                System.out.println("La reserva del señor(a) " + nombreCliente + " se cancelo correctamente.");
                break; //Este es para salir del for
            }
        }
        if (!existe) {
            System.out.println("No se encontro ninguna reserva con el nombre: "  + nombreCliente + ". Realice su reserva");
        }
    }

    //Metodo para consultar reserva especificando el nombre cliente
    public static void consultarReserva(String nombreCliente){
        boolean existe = false;
        for (ReservarHotel reservarHotel : guardarReserva) {
            if (reservarHotel.cliente.equalsIgnoreCase(nombreCliente)) {
                System.out.println("Información de la reserva: ");
                System.out.println("Nombre del cliente " + reservarHotel.cliente);
                System.out.println("Habitacion: " + reservarHotel.numeroHabitacion);
                System.out.println("Fecha de entrada: " + reservarHotel.fechaEntrada);
                System.out.println("Fecha de salida: " + reservarHotel.fechaSalida);
                existe = true;
            }
        }

        //Verificar
        if (!existe) {
            System.out.println("NO se encontro ninguna reserva con el nombre " + nombreCliente + ".");
        }
        
    }

}
