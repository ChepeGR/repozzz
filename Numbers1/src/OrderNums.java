/*public class OrderNums {

    public static int[] orderNums(int[] arr) {
        int aux;
        boolean change = true;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                aux = arr[i];
                arr[i] = arr[i - 1];
                arr[i] = aux;
                change = true;


            }
            return arr;
        }

        public static void main (String[]args){
            int[] array = {8, 7, 9, 5, 6};

            for (int num : orderNums(array)) {
                System.out.println(num);
            }
        }

    }
*/