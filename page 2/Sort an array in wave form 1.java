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
        
        Arrays.sort(arr);
        
        for (int j=0;j<n-1;j+= 2) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
