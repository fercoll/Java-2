package prueba.cuentabancaria;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado: " + cantidad + ". Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Fondos insuficientes");
        } else if (cantidad > 0) {
            saldo -= cantidad;
            System.out.println("Retiro realizado: " + cantidad + ". Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}
