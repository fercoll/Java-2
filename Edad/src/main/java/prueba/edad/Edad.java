

package prueba.edad;
import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite un numero");
        
       int num = scanner.nextInt();
       
      if (num  >= 18) {
            System.out.println("El número " + num + " es mayor de edad.");
        } else {
            System.out.println("El número " + num + " es menor de edad.");
        }
    }
}