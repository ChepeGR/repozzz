//import java.util.ArrayList;

 public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 2, 6, 1};
        boolean isSorted = false;
        int contVueltas = 1;
        int contFor;
        for (int j = 0; j < arr.length - 1; j++) {
            System.out.println(arr[j]);
        }

        while (!isSorted) {
            System.out.println(contVueltas++);
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println("VUELTA FOR: " + (i + 1));
                if (arr[i] > arr[i + 1]) {
                    int aux;
                    aux = arr[i];
                    System.out.println("Cambio de lugar el " + arr[i] + " y el " + arr[i + 1]);
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    isSorted = false;

                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

