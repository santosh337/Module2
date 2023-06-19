import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int[] arr=new int[n];
         
         for (int i=0;i<n;i++) {
             arr[i] = scn.nextInt();
         }
        
        int k = scn.nextInt();
        
        if (k == 0) {
            System.out.print("true");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && (i == 0 || arr[i-1] == 0) && (i == arr.length-1 || arr[i+1] == 0)) {
                arr[i] = 1;
                k--;
                if (k == 0) {
                    System.out.print("true");
                    return;
                }
            }
        }
        System.out.print("false");
    }
}
