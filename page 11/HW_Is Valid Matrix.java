import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean checkContains(int[] arr) {
        boolean[] bArr = new boolean[9];
        for (int i=0;i<9;i++) {
            int num = arr[i];
            if (num < 1 || num > 9) {
                return false;
            }
            if (bArr[num-1]) {
                return false;
            }
            bArr[num-1] = true;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i=0;i<9;i++) {
            arr[i] = scn.nextInt();
         }
        boolean ans = checkContains(arr);
        System.out.println(ans);
        
    }
}
