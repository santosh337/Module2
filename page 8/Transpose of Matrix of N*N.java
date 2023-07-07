import java.io.*;
import java.util.*;

public class Solution {
    
    public static int[][] transpose(int[][] twodm) {
        
        int[][] newtwodm = new int[twodm[0].length][twodm.length];
        
        for (int i = 0; i < twodm.length; i++) {
            for (int j = 0; j < twodm[0].length; j++) {
                newtwodm[j][i] = twodm[i][j];
            }
        }
        print_array(newtwodm);
        return newtwodm;
         
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
        Q = transpose(Q);
    }
}
