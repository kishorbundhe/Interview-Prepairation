package array;

import java.util.Scanner;

public class MaximumDifferenceProblemWithOrder {
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
        maximumDifference(array);
    }

    private static void maximumDifference(int[] array) {
        int smallestNo = array[0];
        int maxDiff=0;
        int n = array.length;
        for( int i=1;i<n;i++){
            if(smallestNo>array[i])
                smallestNo=array[i];
            maxDiff = Math.max(maxDiff,array[i]-smallestNo);
        }
        System.out.println("maximum diff where j>i : " + maxDiff);
    }
}
