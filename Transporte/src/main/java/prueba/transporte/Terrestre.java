
package prueba.transporte;

public class Terrestre {
    int Id;
    String Tipo;
    String Placa;
    String MarcaModelo;

    public Terrestre(int Id, String Tipo, String Placa, String MarcaModelo) {
        this.Id = Id;
        this.Tipo = Tipo;
        this.Placa = Placa;
        this.MarcaModelo = MarcaModelo;
    }

   
    
    public void mostrarproducto(){
    System.out.println(" Id: " + Id + " tipo: " + Tipo + ", Placa:" + Placa + "Marca Y Modelo" + MarcaModelo);
    }
}