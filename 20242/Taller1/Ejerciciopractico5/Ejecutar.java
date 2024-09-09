public class Ejecutar {
    public static void main(String[] args) {
        
        ReservarHotel.nuevaReserva("Andres Lopez", 101, "2022-11-02","2022-11-10");
        ReservarHotel.nuevaReserva("Alejandro Mosquera", 101, "2022-11-02","2022-11-10");
        ReservarHotel.nuevaReserva("Andres", 101, "2022-11-02","2022-11-10");


        
        ReservarHotel.consultarReserva("Andres");
        

        
    }
}
