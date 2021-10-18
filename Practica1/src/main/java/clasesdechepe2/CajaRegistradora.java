package clasesdechepe2;
//atributos
public class CajaRegistradora {
    int cuantaplatahay;

    //constructor
    public CajaRegistradora(int cuantaplatahay)
    {
        this.cuantaplatahay = cuantaplatahay;


    }

    //metodos

    public double getcuantaplatahay(){
        return this.cuantaplatahay;

    }
    public double CobraCliente(Cliente cliente, double monto){
         return cliente.getModificadordepago()* monto;
    }

}
