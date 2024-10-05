
package prueba.mercacentro;

public class Granos {
    int id;
    String Nombre; 
    int Precio;

    public Granos(int id, String Nombre, int Precio) {
        this.id = id;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }
    
    public void mostrarproducto(){
        System.out.println(" Id: " + id + ", Nombre: " + Nombre + ", Precio: $" + Precio);
    }
  }
