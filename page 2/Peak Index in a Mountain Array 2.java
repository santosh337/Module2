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
        int j =0;
        while(arr[j] < arr[j+1]) {
            j++;
        }
        System.out.println(j);
    }
}
