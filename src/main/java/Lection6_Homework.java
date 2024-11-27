import java.util.Arrays;

public class Lection6_Homework {
    public static void main(String[] args) {

        int[] array = new int[] {9,2,16,4,5};
        System.out.println("Average value = " + averageArray(array));

        System.out.println("Min value = " + printMin(array));
        System.out.println("Max value = " + printMax(array));
        printReverse(array);

        printMinAndMax(array);
        System.out.println(ifNumberPresent(array, 10));
        System.out.println(ifNumberPresent(array, 16));

    }

    public static double averageArray(int[] ar){
        double sum = 0;
        for (int i : ar) {
            sum += i;
        }
        return sum/ar.length;
    }

    public static int printMin(int[] ar){
        int min = ar[0];
        for (int i = 0; i<ar.length; i++){
            if (ar[i] < min){
                min = ar[i];
            }
        }
        return min;
    }

    public static int printMax(int[] ar){
        int max = ar[0];
        for (int i = 0; i<ar.length; i++){
            if (ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }

    public static void printMinAndMax(int[] ar){
        Arrays.sort(ar);
        System.out.println("Min value = " + ar[0]);
        System.out.println("Max value = " + ar[ar.length-1]);
    }

    public static void printReverse(int[] ar){
        System.out.print("Reverse array: ");
        for (int i = ar.length-1; i >=0; i--){
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
    }

    public static boolean ifNumberPresent(int[] ar, int num) {
        System.out.print("If number " + num + " present in array? ");
        boolean res = false;
        for (int a : ar) {
            if (a == num) {
                res = true;
            }
        }
        return res;
    }


}
