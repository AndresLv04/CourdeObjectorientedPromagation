public class Ejecutar{
    public static void main(String[] args) throws Exception {
        
        //crear el arreglo --> opción 1
        int[] n = {8, 15, 4, 20, 30};
        
        for(int i  = 0; i < n.length; i++){
            System.out.println("n[" + i + "] = " + n[i]);
        }
        
        System.out.println("-------------------------------");
        
        //crear el arreglo --> opción 2
        int[] a = new int[5];
        
        Random r = new Random();
        
        //Generando números aleatorios para guardarlos en el arreglo "a"
        for(int i = 0; i < a.length; i++){
            a[i] = r.nextInt(20)+1;
        }
        
        //Mostrar los números almacenados en el arreglo "a"
        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
        
        System.out.println("-------------------------------");

        //Objetos de la clase Producto
        
        Producto objP1 = new Producto(1,"Papitas",2500.0);
        Producto objP2 = new Producto(2,"Gaseosa",1500.0);
        Producto objP3 = new Producto(3,"Sandwich",5000.0);
        
        //Crear el arreglo de Productos
        
        Producto[] p = new Producto[3];
        
        //Almacenar los objetos de la clase producto dentro del arreglo
        
        p[0] = objP1;
        p[1] = objP2;
        p[2] = objP3;
        
        double total = 0.0;
        
        //Iteramos cada posición del arreglo p  
        for(int i = 0; i < p.length; i++){
            total += p[i].getPrecio();
        }
        
        System.out.println("Valor de los productos: " + total);
        
        //System.out.println(objP1.getPrecio());
        //System.out.println(objP2.getPrecio());
        //System.out.println(objP3.getPrecio());
        
        System.out.println(objP1);
        
        objP1.setNombre("Telefono");
        objP1.setPrecio(21000.0);
        
        System.out.println(objP1);
        
        //Iteramos cada posición del arreglo p  
        for(int i = 0; i < p.length; i++){
            total += p[i].getPrecio();
        }
        
        System.out.println("Valor de los productos: " + total);        
 
    }
}