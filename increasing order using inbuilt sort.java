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
        
        Arrays.sort(arr);
        
    
        for (int k=0;k<n;k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
