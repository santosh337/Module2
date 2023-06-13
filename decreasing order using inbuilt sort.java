import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] arr = new Integer[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
    
        for (int k=0;k<n;k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
