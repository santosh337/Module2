import java.io.*;
import java.util.*;

public class Solution {
    
    public static int[] reverse(int[] arr, int left , int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int left = 0;
        int right = n-1-k;
        
        int[] firstPart = reverse(arr,left,right);
        left = n-k;
        right = n-1;
        int[] secondPart = reverse(firstPart,left, right);
        
        left = 0;
        right = n-1;
        
        int lastPart[] = reverse(secondPart,left,right);
        
        
        for(int val: lastPart) {
            System.out.print(val+" ");
        }
    }
}
