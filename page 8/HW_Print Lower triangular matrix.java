import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        // logic. 
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if ((i == j) || (i>j)) {
                    System.out.print(arr[i][j]+" ");
                } else {
                    System.out.print(0 +" ");
                }
            }
            System.out.println();
        }
    }
}
