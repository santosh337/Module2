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
        
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        
        for (int a=0;a<n;a++) {
            if (sum < 0) {
                sum = arr[a];
            } else {
                sum += arr[a];
            }
            if (sum == 1) {
                System.out.print("true");
                return;
            }
        }
        System.out.print("false");
    }
}
