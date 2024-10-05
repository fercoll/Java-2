
package prueba.persona;


public class Persona {

    public static void main(String[] args) {
        Datos Persona1 = new Datos(5, "David", 17, "Masculino");
        System.out.println("El id de la persona es " + Persona1.getId());
        System.out.println("El Nombre de la persona es " + Persona1.getNombre());
        System.out.println("La edad de la persona es " + Persona1.getEdad());
        System.out.println("El genero de la persona es " + Persona1.getGenero());
    }
}
