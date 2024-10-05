
package prueba.inventado;

import java.util.Scanner;

public class Inventado {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite el numero de cilindraje de su moto");
        
       int num = scanner.nextInt();
       
      if (num >=400) {
            System.out.println("Su moto de cilindraje " + num + " es de alto cilindraje.");
        } else {
            System.out.println("Su moto de cilindraje " + num + " es de bajo cilindraje.");
        }
    }
}

