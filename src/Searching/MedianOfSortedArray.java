package Searching;

public class MedianOfSortedArray {

    public static void main(String[] args) {
        int a1[] = {10, 20}, n1 = 2, a2[] = {30,40,50}, n2 = 3;
        System.out.println(getMed(a1, a2, n1, n2));
    }

    private static int getMed(int[] a1, int[] a2, int n1, int n2) {
        int beginIndex = 0,endIndex=n1;
        int resultantArraySize=n1+n2;
        // assuming the a2 length is greater than a1
        while(true){
            int i1 = (beginIndex+endIndex)/2;
            int i2 = (resultantArraySize+1)/2-i1;
            int maxleftx1= i1==0?Integer.MIN_VALUE: a1[i1-1];
            int minright1= i1==n1?Integer.MAX_VALUE: a1[i1];

            int maxleft2 = a2[i2-1];
            int minright2= a2[i2];
            if(minright1>=maxleft2&&minright2>=maxleftx1){
                if(resultantArraySize%2==0) return (Math.min(minright1,minright2) + Math.max(maxleftx1,maxleft2))/2;
                else return Math.max(maxleftx1,maxleft2);
            } else if(minright1<maxleft2)
                beginIndex=i1+1;
            else
                endIndex=i1-1;
        }
    }
}
