import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int l = scn.nextInt();
        int[][] Q = new int[k][l];
        
        for (int i=0;i<k;i++) {
            for (int j=0;j<l;j++) {
                Q[i][j] = scn.nextInt();
            }
        }
        
        for (int i=0;i<k;i++) {
            for (int j=0;j<l;j++) {
                if (j%2==0) {
                    System.out.print(Q[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
