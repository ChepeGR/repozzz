package clasesdechepe2;

public class Comun extends Cliente {
    String domicilio;

    public Perro getPerro() {
        return perro;
    }

    Perro perro;

    public Comun(String domicilio, String nombre, int id, int credito){
        super(nombre, id, credito);
        this.domicilio=domicilio;

    }
    public Comun(double descuento, String nombre, int id, double credito, double modificadordepago) {
        super(nombre, id, credito, modificadordepago);
        this.modificadordepago = modificadordepago;
    }

    public Comun(double descuento, String nombre, int id, double credito, double modificadordepago, String nombreperro) {
        super(nombre, id, credito, modificadordepago);
        this.modificadordepago = modificadordepago;
        this.perro = new Perro(nombreperro);
    }

    public static class Perro{
        private String nombre;

        public Perro(String nom){
            nombre=nom;
        }


        @Override
        public String toString() {
            return "Perro{" +
                    "nombre='" + nombre + '\'' +
                    '}';
        }
    }
}
