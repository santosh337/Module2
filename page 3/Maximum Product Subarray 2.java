import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
       int min = arr[0];
       int max = arr[0];
       int ans = arr[0];
       
       for (int i=1;i<n;i++) {
           int tempMin = min;
           min = Math.min(arr[i],Math.min(arr[i]*min,arr[i]*max));
           max = Math.max(arr[i],Math.max(arr[i]*tempMin,arr[i]*max));
           ans = Math.max(ans,max);
       }
        System.out.print(ans);
    }
}
