

package prueba.par;
import java.util.Scanner;

public class Par {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite un numero");
        
       int num = scanner.nextInt();
       
      if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }
    }
}
