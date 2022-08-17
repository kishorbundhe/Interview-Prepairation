package array;

import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates {
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
        removeDuplicates(array);
    }

    private static void  removeDuplicates(int[] array) {
        int length=  array.length;
        for(int i=0,j=1;j<length;j++){
            if(array[i]==array[j]){
                array[j]=-1;
            }else if(array[i+1]==-1){
                array[i+1]=array[j];
                i++;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
