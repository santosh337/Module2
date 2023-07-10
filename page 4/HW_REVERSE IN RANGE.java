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
        int left = scn.nextInt();
        int right = scn.nextInt();
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }
        
        for(int val: arr) {
            System.out.println(val);
        }
    }
}
