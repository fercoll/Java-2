
package prueba.persona;

public class Datos {
    int Id;
    String Nombre;
    int Edad;
    String Genero;

    public Datos(int Id, String Nombre, int Edad, String Genero) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
}