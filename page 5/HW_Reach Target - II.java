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
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (i < j && arr[i] == arr[i+1]) {
                i++;
            } 
            while (i < j && arr[j] == arr[j-1]) {
                j--;
            } 
            
            if (arr[i] + arr[j] == k) {
                System.out.println(i + " " + j);
                i++;
                j--;
            } else if (arr[i] + arr[j] > k) {
                j--;
            } else {
                i++;
            }
        }
        
        
        // for (int i=1;i<n;i++)  {
        //     if (arr[i-1] + arr[i] == k) {
        //         System.out.println(i-1 + " " + i);
        //     }
        // }
        
    }
}
