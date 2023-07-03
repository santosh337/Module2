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
        
        
        for (int i=0;i<n-1;i++) {
            int min = arr[i];
            for (int j=i+1;j<n;j++) {
                if (arr[j]>arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int k=0;k<n;k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
