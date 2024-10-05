
package prueba.curso;

public class Curso {

    public static void main(String[] args) {
        Aprendices aprendiz1 = new Aprendices (" Andres David", " Diaz Montealegre", " Derechos fundamentales ", 92);
        Aprendices aprendiz2 = new Aprendices (" Abad Yusseff ", " Meneses Ruiz ", " Razonamiento Cuantitativo ", 98);
        Aprendices aprendiz3 = new Aprendices (" Simon Jacobo", " Ospina ", " Cultura Fisica", 95);
        Aprendices aprendiz4 = new Aprendices (" Johan Sebastian ", " Triana ", " Ambiental ", 68);
        Aprendices aprendiz5 = new Aprendices (" Lesly Tatiana ", " Cortes Garzon ", " Ingles ", 70);
        
        aprendiz1.mostrarinfo();
        aprendiz2.mostrarinfo();
        aprendiz3.mostrarinfo();
        aprendiz4.mostrarinfo();
        aprendiz5.mostrarinfo();
    }
    
}

