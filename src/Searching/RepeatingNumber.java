package Searching;

// Constraints
// No modification to the array
// o(n)  time
//  o(1) space complexity
// 1<=max(arr element) <= n-1 where n is the size of the array
public class RepeatingNumber {
    public static void main(String[] args) {
        int a1[] = {1,3,3,2},n1=4;
        System.out.println(getRep(a1,n1));
    }

    private static int getRep(int[] a1, int n1) {
        int slow = a1[0],fast=a1[0];
        do {
            slow = a1[slow];
            fast = a1[a1[fast]];
        } while(slow!=fast);

        slow = a1[0];

        while (slow!=fast){
            slow = a1[slow];
            fast = a1[fast];
        }
        return slow;
    }
}
