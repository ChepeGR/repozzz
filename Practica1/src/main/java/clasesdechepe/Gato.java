package clasesdechepe;

public class Gato extends Mascota{
    String bigotes;
    String habilidadSalto;

    public Gato(String bigotes,String habilidadSalto, int edad, String nombre){
        super(edad, nombre);
        this.bigotes=bigotes;
        this.habilidadSalto=habilidadSalto;

    }


}
