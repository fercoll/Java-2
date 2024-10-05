
package prueba.estudiantes;


public class Estudiantes {

    public static void main(String[] args) {
      Estudiante estudiante1 = new Estudiante("Natalia Fernanda", "Ciencias", 6.0);
      Estudiante estudiante2 = new Estudiante("Santiago Rendon", "Matematicas", 4.5);
      Estudiante estudiante3 = new Estudiante("Andres David", "Fisica", 4.9);
      
      estudiante1.mostrarinfo();
      estudiante2.mostrarinfo();
      estudiante3.mostrarinfo();
    }
}