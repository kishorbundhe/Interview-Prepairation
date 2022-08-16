package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralOrderTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of use cases you want to perform");
        int n = scanner.nextInt();
        System.out.println("Enter the 2D matrix size ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        final List<ArrayList<Integer>> twoDList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < x; i++) {
            ArrayList tempArrayList =  new ArrayList();
            for( int j =0;j<y;j++){
                int value = scanner.nextInt();
                tempArrayList.add(value);
            }
            twoDList.add(tempArrayList);
        }
      printSprialOrder(twoDList);
    }

    private static void printSprialOrder(final List<ArrayList<Integer>> A) {
      int xStart = 0;
      int yStart = 0;
      int x = 0;
      int y = 0;
      int noOfcolumn = A.get(0).size()-1;
      int noOfrow = A.size()-1;
      int noOfElement = (noOfcolumn+1)*(noOfrow+1);
      while(noOfElement!=0){
          noOfElement--;
          System.out.print(A.get(x).get(y)+" ");
          if(y<noOfcolumn && x==xStart)y++;
          else if(x<noOfrow && y==noOfcolumn)x++;
          else if(x==noOfrow && y>yStart)y--;
          else if (y==yStart && x>xStart) x--;
          if(x== xStart && y == yStart)
          { xStart++ ; yStart++; noOfcolumn--; noOfrow--; x=xStart; y=yStart; }
      }

    }


}
