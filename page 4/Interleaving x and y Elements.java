import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        int[] ansArr = new int[n];
        int p = 0;
        int q = (n/2);

        for (int j=0;j<n;j++) {
            arr[j] = scn.nextInt();
        }
        int i = 0;
        while (p<(n/2) && q < n) {
            ansArr[i] = arr[p];
            i++;
            p++;
            ansArr[i] = arr[q];
            q++;
            i++;
        }
        
        for (int val: ansArr) {
            System.out.print(val+" ");
        }
    }
}
