package array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArrayByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of use cases you want to perform");
        int n = scanner.nextInt();
        System.out.println("Enter the size of array");
        int x = scanner.nextInt();
        System.out.println("Enter the d, how many times you want to rotate");
        int d = scanner.nextInt();
        int [] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = scanner.nextInt();
        }
        leftRotateArray(array,d);
    }

    private static void leftRotateArray(int[] array,int d) {
        int n = array.length;
        for(int i=0;i<d;i++){
            int temp = array[i];
            array[i] = array[d-(i+1)];
            array[d-(i+1)]=temp;
        }

        for(int i=d;i<n;i++){
            int temp = array[i];
            array[i] = array[--n];
            array[n]=temp;
        }
         n = array.length;
        for( int i=0;i<n;i++){
            int temp = array[i];
            array[i] = array[--n];
            array[n]=temp;
        }
        System.out.println(Arrays.toString(array));

    }


}
