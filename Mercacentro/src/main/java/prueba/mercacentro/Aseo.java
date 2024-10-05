
package prueba.mercacentro;

import java.util.Scanner;

public class Aseo {
    int Id;
    String Nombre;
    int Precio; 

    public Aseo(int Id, String Nombre, int Precio) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }
    
    public void mostrarproducto(){
    System.out.println(" Id: " + Id + ", Nombre: " + Nombre + ", Precio: $" + Precio);
    }
} 
    
   

   
