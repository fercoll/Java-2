
package prueba.cuentabancaria;

import java.util.Scanner;

public class Banco {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CuentaBancaria cuenta = new CuentaBancaria("Andres David", 500.000);
    int opcion;

    do {
    System.out.println("Seleccione una opción:");
    System.out.println("1. Mostrar saldo");
    System.out.println("2. Depositar");
    System.out.println("3. Retirar");
    System.out.println("4. Salir");
    opcion = scanner.nextInt();
        

    switch (opcion) {
    case 1:
    cuenta.mostrarSaldo();
    break;
    case 2:
    System.out.print("Ingrese la cantidad a depositar: ");
    double deposito = scanner.nextDouble();
    cuenta.depositar(deposito);
    break;
    case 3:
    System.out.print("Ingrese la cantidad a retirar: ");
    double retiro = scanner.nextDouble();
    cuenta.retirar(retiro);
    break;
    case 4:
    System.out.println("Saliendo...");
    break;
    default:
    System.out.println("Opción no válida. Intente de nuevo.");
    break;
    }
    } 
    while (opcion != 4);
    }
}