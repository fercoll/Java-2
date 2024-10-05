

package prueba.transporte;

import java.util.Scanner;

public class Transporte {

    public static void main(String[] args) {
        
        
        Aereo Avion =          new Aereo (1, "Avion","ABC12B", "Avianca - 2000");
        Aereo Helicoptero =    new Aereo (2, "Helicoptero","ABC13B", "AC352- 2006");
        Aereo Avioneta    =    new Aereo (3, "Avioneta","ABC12B", "BR567 - 2014");
        

        Acuatico Barco =    new Acuatico (1, " Barco","ABV34NN", "### - 2005");
        Acuatico Lancha=    new Acuatico (2, " Lancha","ABV35NN", "### - 2014");
        Acuatico Submarino= new Acuatico (3, " Submarino","ABV36NN", "### - 1996");
        Acuatico Velero =   new Acuatico (4, " Velero","ABV37NN", "### - 2009");
        
        Terrestre Carro =   new Terrestre (1, " Carro ","ILN67L", "### - 2016");
        Terrestre Bus =     new Terrestre (2, " Bus ","ILN68L", "### - 2018");
        Terrestre Camion =  new Terrestre (3, " Camion ","ILN69L", "### - 2000");
        
        Scanner scanner = new Scanner (System.in);
        int opcion;
        
        do {
            System.out.println(" Menu de transportes ");
            System.out.println("1. Mostrar transportes aereos");
            System.out.println("2. Mostrar transportes acuaticos");
            System.out.println("3. Mostrar transportes terrestres");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion){
                case 1 -> {
                    System.out.println("transportes aereos");
                    Avion.mostrarproducto();
                    Helicoptero.mostrarproducto();
                    Avioneta.mostrarproducto();
                }
                case 2 -> {
                    System.out.println("transportes acuaticos ");
                    Barco.mostrarproducto();
                    Lancha.mostrarproducto();
                    Submarino.mostrarproducto();
                    Velero.mostrarproducto();
                }
                case 3 -> {
                    System.out.println(" Mostrar transportes terrestres ");
                    Carro.mostrarproducto();
                    Bus.mostrarproducto();
                    Camion.mostrarproducto();
                }
                case 4 -> System.out.println(" Saliendo del sistema ");
                default -> System.out.println(" Opcion no valida ");
                    }
        } while (opcion != 4);

        scanner.close();
    }
}
