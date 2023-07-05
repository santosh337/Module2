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
        
        for (int j=1;j<n-1;j++) {
            if (arr[j]>arr[j-1] && arr[j] > arr[j+1]) {
                System.out.print(arr[j]+" ");
            }
        }
    }
}
