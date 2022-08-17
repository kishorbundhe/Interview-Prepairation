package array;

import java.util.Arrays;
import java.util.Scanner;

public class SegregatePosAndNegNumber {
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
        seggregatePosAndNegative(array);
    }

    private static void seggregatePosAndNegative(int[] array) {
        int indexOfPosNo = 0;
        int length = array.length;
        for( int i=0;i<length;i++){
            if( array[i]>0){
                int temp = array[i];
                array[i] = array[indexOfPosNo];
                array[indexOfPosNo] =temp;
                indexOfPosNo++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
