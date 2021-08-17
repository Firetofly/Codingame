import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[] = new int[n];
        // the number of temperatures to analyse
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            array[i]=t; // a temperature expressed as an integer ranging from -273 to 5526
        }
        int min;

        if (n==0)min=0;

        else if(n==1)min=array[0];

        else {
            min= array[0];
            for(int i1=0; i1<n; i1++){
                min=Math.abs(array[i1])<Math.abs(min)?array[i1]<0?array[i1]:array[i1]:min;
                if (array[i1]==min*-1) min=Math.max(min,array[i1]);
            }
        }
        System.out.println(min);
        in.close();
    }
}