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
        int tar = scn.nextInt();
        
        int i = 0;
        int j = arr.length - 1;
        
        while (i<j) {
            int sum = arr[i] + arr[j];
            
            if (sum == tar) {
                while (i+1 < j && arr[i] == arr[i+1]) {
                    i++;
                }
                
                while (j-1 > i && arr[j] == arr[j-1]) {
                    j--;
                }
                
                
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            } else if (sum > tar) {
                j--;
            } else {
                i++;
            }
        }
    }
}
