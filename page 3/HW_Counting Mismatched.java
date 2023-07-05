import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int k=0;k<n;k++) {
            arr[k] = scn.nextInt();
        }
        
        int count = 0;
        int b[] = new int[n];
        for (int i = 0; i < n; i++)
            b[i] = arr[i];
        Arrays.sort(b);
      for(int i =0; i<arr.length; i++){
          if(arr[i]!=b[i])count++;
      }
        System.out.println(count);
    }
}
