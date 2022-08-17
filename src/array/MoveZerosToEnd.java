package array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of use cases you want to perform");
        int n = scanner.nextInt();
        System.out.println("Enter the size of array");
        int x = scanner.nextInt();
        int [] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = scanner.nextInt();
        }
        moveZerosToEnd(array);
    }

    private static void moveZerosToEnd(int[] array) {
        int length = array.length;
        int indexOfCurrentPositiveNo=0;
        for( int i=0;i<length;i++){
            if(array[i]!=0){
                int temp  = array[i];
                array[i] =0;
                array[indexOfCurrentPositiveNo] = temp;
                indexOfCurrentPositiveNo++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
