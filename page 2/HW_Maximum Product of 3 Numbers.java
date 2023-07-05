import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr[] = new int[n];
        for (int j=0;j<n;j++) {
            arr[j] = scn.nextInt();
        }
        Arrays.sort(arr);
        
        System.out.println(Math.max(arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3],arr[arr.length-1]*arr[0]*arr[1]));
        
    }
}
