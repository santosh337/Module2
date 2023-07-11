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
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (arr[i] + arr[j] == tar) {
                    System.out.print(i +" " +j);
                }
            }
            System.out.println();
        }
    }
}
