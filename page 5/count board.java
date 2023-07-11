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
        
        int count = 0;
        if(arr == null || arr.length == 0) {
            System.out.println(count);
            return;
        }
        Arrays.sort(arr);
        int l = 0, h = arr.length-1;
        while(l <= h){
            if(arr[l]+arr[h] > tar) {
                h--;
            } else {
                h--;
                l++;
            }
            count++;
        }
        System.out.println(count);
    }
}
