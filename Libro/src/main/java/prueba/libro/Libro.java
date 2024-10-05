
package prueba.libro;

public class Libro {

    public static void main(String[] args) {
    autor Libros = new autor ("La psicologia del dinero", "Morgan Housel", 305, 0);
        
       Libros.mostrarinfo();
       
       Libros.leerPagina();
       Libros.leerPagina();
       Libros.leerPagina();
       Libros.leerPagina();
       Libros.leerPagina();
       Libros.leerPagina();
  
       
       Libros.cerrarLibro();
    }
}
