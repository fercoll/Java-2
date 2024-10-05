
package prueba.mercacentro;

  public class Frutas {
       int Id;
       String Nombre;
       int Precio;

        public Frutas(int Id, String Nombre, int Precio) {
            this.Id = Id;
            this.Nombre = Nombre;
            this.Precio = Precio;
        }
       
        public void mostrarproducto(){
            System.out.println(" Id: " + Id + ", Nombre: " + Nombre + ", Precio: $" + Precio);
        }
       
   }
