import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++) {
            arr1[i] = scn.nextInt();
        }
        Arrays.sort(arr1);
        
        System.out.println(arr1[n/2]);
    }
}
