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
        
        for (int j=0;j<n-1;j++) {
            if (arr[j] == 0) {
                for (int p=n-1;p> j+1;p--) {
                    arr[p] = arr[p-1];
                }
                arr[j+1] = 0;
                j++;
            }
        }
        
        for (int val:arr) {
            System.out.print(val+" ");
        }
    }
}
