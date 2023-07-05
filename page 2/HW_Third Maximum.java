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
        
        Integer max1 = 0;
        Integer max2 = 0;
        Integer max3 = 0;
        for (Integer p : arr) {
            if (p.equals(max1) || p.equals(max2) || p.equals(max3)) continue;
            if (max1 == 0 || p > max1) {
                max3 = max2;
                max2 = max1;
                max1 = p;
            } else if (max2 == 0 || p > max2) {
                max3 = max2;
                max2 = p;
            } else if (max3 == 0 || p > max3) {
                max3 = p;
            }
        }
        if (max3 == 0) {
            System.out.println(max1);
        } else {
            System.out.println(max3);
        }
        
    }
}
