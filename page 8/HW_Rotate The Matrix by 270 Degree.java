import java.io.*;
import java.util.*;

public class Solution {
    
    public static void transpose(int[][] twodm) {
        int n = twodm.length;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i<j) {
                    int temp = twodm[i][j];
                    twodm[i][j] = twodm[j][i];
                    twodm[j][i] = temp;
                }
            }
        }
    }
    
    public static void reverse1D(int[] d) {
        int i = 0;
        int j = d.length - 1;
        while (i<j) {
            int temp = d[i];
            d[i] = d[j];
            d[j] = temp;
            i++;
            j--;
        }
        
    }
    
    public static void rotate(int[][] Q) {
        transpose(Q);
        for (int [] d :Q) {
            reverse1D(d);
        }
    }
    
    public static void print_array(int[][] twodm) {
        for (int i = 0; i < twodm.length; i++) {
            for (int j = 0; j < twodm[0].length; j++) {
                System.out.print(twodm[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int[][] Q = new int[k][k];
        
        for (int i=0;i<k;i++) {
            for (int j=0;j<k;j++) {
                Q[i][j] = scn.nextInt();
            }
        }
        rotate(Q);
        rotate(Q);
        rotate(Q);
        print_array(Q);
    }
}
