
public class Ejecutar {
    public static void main(String[] args) {
        Libro objLibro1 = new Libro("Fisica I", "Javier Jurado", "3452-2342-123", 239, 5);

        objLibro1.estaDisponible();
        System.out.println(objLibro1.prestar());
        System.out.println(objLibro1.prestar());
        System.out.println(objLibro1.prestar());
        System.out.println(objLibro1.prestar());
        System.out.println(objLibro1.prestar());
        objLibro1.estaDisponible();
        System.out.println(objLibro1.devolver());
        objLibro1.estaDisponible();
        System.out.println(objLibro1.prestar());

    }
}
