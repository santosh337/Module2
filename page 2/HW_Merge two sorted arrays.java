import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++) {
            arr1[i] = scn.nextInt();
        }
        
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i=0;i<m;i++) {
            arr2[i] = scn.nextInt();
        }
        
        int[] arr3 = new int[n+m];
        
        int k = 0;
        for (int j=0;j<n;j++) {
            arr3[k++] = arr1[j];
        }
        
        for (int j=0;j<m;j++) {
            arr3[k++] = arr2[j];
        }
        
        Arrays.sort(arr3);
        
        for (int a = 0;a< n+m;a++) {
            System.out.print(arr3[a]+" ");
        }
    }
}
