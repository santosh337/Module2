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
        
        
        int minr = 0 , minc = 0;
        int maxr = m-1, maxc = n-1;
        int x = arr[0][0];
        
        int total = m*n;
        int current = 0;
        
        while (current < total) {
            // First Direction  // minr fixed --- min C to max C
            
            for (int j = minc;j<= maxc && current < total;j++) {
               //  System.out.print(arr[minr][j]+"   ");
                if (current != 0) {
                    int y = arr[minr][j];
                    arr[minr][j] = x;
                    x = y;
                }
                current++;
            }
            minr ++;
            
            // Second Direction  // maxc fixed --- minr  to max r
            for (int j = minr;j<= maxr && current < total;j++) {
                // System.out.print(arr[j][maxc]+"   ");
                int y = arr[j][maxc];
                arr[j][maxc] = x;
                x = y;
                current++;
            }
            maxc--;
            
            // third Direction  // maxr fixed --- maxc  to min c
            for (int j = maxc;j>= minc && current < total;j--) {
                // System.out.print(arr[maxr][j]+"   ");
                int y = arr[maxr][j];
                arr[maxr][j] = x;
                x = y;
                current++;
            }
            maxr--;
            
            // forth Direction  // minC fixed --- maxr  to min r
            for (int j = maxr;j>= minr && current < total;j--) {
                // System.out.print(arr[j][minc]+"   ");
                int y = arr[j][minc];
                arr[j][minc] = x;
                x = y;
                current++;
            }
            minc++;
        }
        
        arr[0][0] = x;
        
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
