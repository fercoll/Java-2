
package prueba.coche;


public class Coche {

    public Coche(String camaro, String string, int par) {
    }

    public static void main(String[] args) {
        Datos Coche = new Datos ("camaro", "2023", 2024);
        Coche.mostrarDatos();
        Coche.acelerar();
        Coche.frenar();
    }
}
