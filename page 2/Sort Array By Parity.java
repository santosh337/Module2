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
        
        // step sort by even .... and then odd . .....
        int l = 0;
        int r = n - 1;
        
        while (l <= r) {
            if (arr[l]%2 == 0) {
                l++;
            } else if (arr[r]%2 != 0) {
                r--;
            } else {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        
        Arrays.sort(arr,0,l);
        Arrays.sort(arr,l,n);
        
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
