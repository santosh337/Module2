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
        
        int l = scn.nextInt();
        int r = scn.nextInt();
        int sum = 0;
        for (int j=0;j<n;j++) {
            sum += arr[j];
            arr[j] = sum;
        }
        
        for (int i=l;i<=r;i++) {
            System.out.println(arr[i]);
        }
    }
}
