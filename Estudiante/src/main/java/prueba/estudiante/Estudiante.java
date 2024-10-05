
package prueba.estudiante;

public class Estudiante {
    String nombre;
    String matricula;
    double nota;

    public Estudiante(String nombre, String matricula, double nota) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.nota = nota;
    }
    
    public boolean aprobar(){
        return nota >= 5.0;
    }
    public void mostrarinfo(){
        System.out.println(" El nombre del estudiante es " + nombre);
        System.out.println(" La matricula del estudiabte es " + matricula);
        System.out.println(" La nota del estudiante es " + nota);
        
        if (aprobar()){
            System.out.println(" El estudainte ha aprobado ");
        } else {
            System.out.println(" El estuduabte no ha aprobado ");
        }
    }
}

