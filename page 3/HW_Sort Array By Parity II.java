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
        
        int i=0,j=1;
        Arrays.sort(arr);
        
        while(i<arr.length && j<arr.length) {
            if(arr[i]%2==0) i+=2;
            else{
                if(arr[j]%2!=0) j+=2;
                else{
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int val : arr) {
            System.out.print(val+" ");
        }
    }
}
