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
        
        int[] left = new int[n];
        left[0] = 0;
        for (int i = 1;i<n;i++) {
            left[i] = left[i-1] + arr[i-1];
        }
        
        int[] right = new int[n];
        right[n-1] = 0;
        for (int i = n-2;i>=0;i--) {
            right[i] = right[i+1] + arr[i+1];
        }
        
        // Compare 
        int ans = -1;
        for(int i=0;i<n;i++) {
            if (left[i] == right[i]) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
