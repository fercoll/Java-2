
package prueba.mercacentro;

import java.util.Scanner; 

public class Mercacentro {

    public static void main(String[] args) {
        Aseo Limpido = new Aseo(1, " Limpido ", 14000);
        Aseo CremaDental = new Aseo(2, " Crema Dental", 6700);
        Aseo PapelHigienico= new Aseo(3, "PapelHigenico", 5000);
        Aseo Jabon = new Aseo(4,"Jabon", 4900);
        
        Granos Frijol = new Granos (1, " Frijol ", 2500);
        Granos Lenteja = new Granos (2, " Lenteja ", 3000);
        Granos Arveja = new Granos (3, " Arveja ", 3300);
        Granos Garbanzo = new Granos (4, " Garbanzo ", 3500);
        
        Frutas Manzana = new Frutas (1, " Manzana ", 2000);
        Frutas Pera = new Frutas (2, " Pera ", 3000);
        Frutas Fresa = new Frutas (3, " Fresa ", 3000);
        
         Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println(" Menu de productos ");
            System.out.println("1. Mostrar productos de Aseo");
            System.out.println("2. Mostrar productos de Granos");
            System.out.println("3. Mostrar productos de Frutas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion){
                case 1 -> {
                    System.out.println(" Productos de aseo");
                    Limpido.mostrarproducto();
                    CremaDental.mostrarproducto();
                    PapelHigienico.mostrarproducto();
                    Jabon.mostrarproducto();
                }
                case 2 -> {
                    System.out.println(" Productos de granos ");
                    Frijol.mostrarproducto();
                    Lenteja.mostrarproducto();
                    Arveja.mostrarproducto();
                    Garbanzo.mostrarproducto();
                }
                case 3 -> {
                    System.out.println(" Productos de frutas ");
                    Manzana.mostrarproducto();
                    Pera.mostrarproducto();
                    Fresa.mostrarproducto();
                }
                case 4 -> System.out.println(" Saliendo del sistema ");
                default -> System.out.println(" Opcion no valida ");
                    }
        } while (opcion != 4);

        scanner.close();
    }
}
                    
                    
            
        
        
 
