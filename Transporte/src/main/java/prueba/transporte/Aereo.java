
package prueba.transporte;

public class Aereo {
    int Id;
    String Tipo;
    String Placa;
    String MarcaModelo;

    public Aereo(int Id, String Tipo, String Placa, String MarcaModelo) {
        this.Id = Id;
        this.Tipo = Tipo;
        this.Placa = Placa;
        this.MarcaModelo = MarcaModelo;
    }

    
    public void mostrarproducto(){
    System.out.println(" Id: " + Id + " tipo: " + Tipo + ", Placa:" + Placa + "Marca Y Modelo" + MarcaModelo);
    }
}