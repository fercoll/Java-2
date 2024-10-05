
package prueba.libro;

public class autor {
        String titulo;
    String autor;
    int numeropaginas;
    int paginaactual;

    public autor(String titulo, String autor, int numeropaginas, int paginaactual) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
        this.paginaactual = paginaactual;
    }

    
    public void leerPagina(){
        if (paginaactual < numeropaginas){
            paginaactual++;
            System.out.println("Leyendo pagina" + paginaactual);
        } else {
            System.out.println("Se ha terminado el libro");
        }
    }
    public void cerrarLibro(){
        paginaactual = 0;
        System.out.println("Se ha cerrado el libro");
    }
    public void mostrarinfo(){
        System.out.println(" El titulo del libro es " + titulo);
        System.out.println(" El autor del libro es " + autor);
        System.out.println(" El libro tiene " + numeropaginas + " paginas ");
    }
}
