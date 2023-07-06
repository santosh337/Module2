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
        
        int[] max = new int[n];
        max[0] = arr[0];
        for (int j=1;j<n;j++) {
            max[j] = Math.max(max[j-1],arr[j]);
        }
        
        for (int val: max) {
            System.out.println(val+" ");
        }
    }
}
