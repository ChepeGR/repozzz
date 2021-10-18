package clasesdechepe2;

public class Vip extends Cliente{
    int vipLevel;



        public Vip(int vipLevel, String nombre, int id, double credito){
        super(nombre, id, credito, 0.8);
        this.vipLevel = vipLevel;


        }




    }


