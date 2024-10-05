

package prueba.multiplicar;
import java.util.Scanner;

public class Calculadoraa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Selecciona una operacion: Suma(1), Resta(2), Multiplicacion(3), Division(44)");
        

        int opcion = scanner.nextInt();

        System.out.println("Digite su primer numero");
        int num1 = scanner.nextInt();

        System.out.println("Digite su segundo numero");
        int num2 = scanner.nextInt();

        
        int resultado = 0;
        switch (1) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
               resultado = num1 / num2;
               System.out.println("El resultado de la division:" + resultado);
        }

        scanner.close();
    }
}