package motoo;
public class Moto {

    // LAVAMOTOS LA TORA

    // Atributos
    String placa;
    String dueno;
    public int cilindraje;
    boolean encerado;

    // Constructor
    public Moto(String placa, String dueno, int cilindraje, boolean encerado) {
        this.placa = placa;
        this.dueno = dueno;
        this.cilindraje = cilindraje;
        this.encerado = encerado;
    }

    // Metodo
    public int valorLavado() {
        int base = 8000;
        if (cilindraje > 200) {
            base = 14000;
        } else if (cilindraje > 125) {
            base = 11000;
        }
        if (encerado) {
            base = base + 6000;
        }
        return base;
    }

    // Metodo descripcion()
    public String descripcion() {
        return placa + " - " + dueno + " (" + cilindraje + "cc)";
    }

}