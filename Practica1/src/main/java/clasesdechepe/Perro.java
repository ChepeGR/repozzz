package clasesdechepe;

public class Perro extends Mascota{
    private int huesosEnterrados;

    public Perro(int huesosEnterrados,int edad, String nombre){
        super(edad,nombre);
        this.huesosEnterrados=huesosEnterrados;


    }

    public int getHuesosEnterrados(){
        return huesosEnterrados;


    }

}

