public class NewCode {
    public static int cuantasVoc(char[] arr){
        int cVoc=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]== ('a')|| arr[i]==('e')||arr[i]==('i')||arr[i]==('o')||arr[i]==('u')){
                cVoc+=1;

            }
        }
        return cVoc;

    }
    public static boolean hayLetras(char[] arr, char let){
        boolean letraExiste=false;
        for(int i=0;i<arr.length; i++){
            if(arr[i]==let){
                letraExiste=true;

            }
        }
        return letraExiste;
    }
    public static void main(String[] args){
        char[] array={'h','o','s','p','i','t','a','l'};
        System.out.println(cuantasVoc(array));
        System.out.println(hayLetras(array,'j'));
    }


}
