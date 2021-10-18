package clasesdechepe2;

public abstract class Cliente {
    protected String nombre;
    protected int id;
    protected double credito;
    protected double modificadordepago;

    public Cliente(String nombre,int id,double credito){
        this.nombre= nombre;
        this.id=id;
        this.credito=credito;
        modificadordepago=1;

    }


    public Cliente (){
        this.nombre= "nombrepordefecto";
        this.id= 0;
        this.credito = 1000;
        modificadordepago=1;

    }

    public Cliente(String nombre, int id, double credito, double modificadordepago) {
        this.nombre= nombre;
        this.id= id;
        this.credito = credito;
        this.modificadordepago=modificadordepago;
    }


    public void setCredito(double nuevocredito){
        this.credito = nuevocredito;
    }

    public double getCredito(){
        return this.credito;
    }
    public double getModificadordepago(){
        return this.modificadordepago;

    }


    public void setNombre(String nuevonombre){
        this.nombre = nuevonombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void pagar(double monto){
        this.credito=this.credito-monto;


    }

    public void robar(Cliente clienterobado, float cuantoRoba){
        this.credito = this.credito + cuantoRoba;
        clienterobado.setCredito(clienterobado.getCredito()-cuantoRoba);
    }



}
