public class NewMain {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,1,2};
        float sum=0;
        float prom;
        int count2=0;
        for(int i=0; i<arr.length;i++){
           sum+= arr[i];
           System.out.println((i + "   "+ sum));
           if(arr[i]==2){
               count2++;
           }
        }
        prom=sum/ arr.length;
        System.out.println(prom);
        System.out.println(count2);
    }
}


