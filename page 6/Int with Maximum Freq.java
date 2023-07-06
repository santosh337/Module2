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
        
        int[] freq = new int[10];
        
        for (int i=0;i<n;i++) {
            freq[arr[i]]++;
        }
        
        int count = 0;
        int ans = 0;
        for (int i=0;i<10;i++) {
            if (ans < freq[i]) {
                ans = freq[i];
                count = i;
            }
        }
        System.out.print(count);
    }
}
