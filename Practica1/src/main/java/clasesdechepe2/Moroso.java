package clasesdechepe2;

public class Moroso extends Cliente{
    int cuantodebe;

    public Moroso(int cuantodebe, String nombre, int id, int credito){
        super(nombre, id, credito);
        this.cuantodebe=cuantodebe;

    }
    public Moroso(double descuento, String nombre, int id, double credito, double modificadordepago) {
        super(nombre, id, credito, modificadordepago);
        this.modificadordepago = modificadordepago;
    }

}
