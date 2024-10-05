
package prueba.curso;

public class Aprendices {
        String Nombre;
    String Apellido;
    String Transversal;
    int Nota;

    public Aprendices(String Nombre, String Apellido, String Transversa, int Nota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Transversal = Transversa;
        this.Nota = Nota;
    }
    
    public boolean aprobar(){
        return Nota >=70;
    }
    
    public void mostrarinfo(){
        System.out.println(" El nombre y apellido del aprendiz es " + Nombre + "" + Apellido);
        System.out.println(" Ejecuto la transversal " + Transversal + " y obtuvo una nota de " + Nota);
        
         if (aprobar()){
             System.out.println(" El aprendiz ha aprobado la transversal");
           } else{
             System.out.println(" El aprendiz no ha aprobado la transversal ");
         }       
    }
}