package array.interviews;



public class CircularPrinter {
    public static void main(String[] args) {
        String s ="abcd";
        System.out.println(getTime(s));
    }

    private static long getTime(String s) {
        s="a"+s;
        s= s.toLowerCase();
        char [] array = s.toCharArray();
        int n = array.length;
        long time=0;
        for( int i=0;i<n-1;i++){
            int distanceFromA= Math.abs(array[i]-'a');
            int distanceFromZ = Math.abs(array[i]-'z');
            if(distanceFromA<distanceFromZ){
                time += Math.min(Math.abs(array[i+1]-array[i]), distanceFromA+1+Math.abs('z'-array[i+1]));
            }else{
                time += Math.min(Math.abs(array[i+1]-array[i]), distanceFromZ+1+Math.abs('a'-array[i+1]));
            }
        }
        return time;
    }
}
