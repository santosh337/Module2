import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer arr[] = new Integer[n];
        
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        
        int d = Integer.MAX_VALUE;
        
        Arrays.sort(arr);
        
        for (int i=0;i<=n-k;i++) {
            int min = arr[i];
            int max = arr[i+k-1];
            d = Math.min(d,max-min);
        }
        
        
            System.out.print(d);
    }
}
