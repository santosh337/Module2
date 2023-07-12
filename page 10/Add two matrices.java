import java.io.*;
import java.util.*;

public class Solution {
    
    public static int[][] addTwoMatrix(int[][] arr1,int m,int n ,int[][] arr2,int p, int q) {
        int [][] ans = new int[m][n];
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr1 = new int[m][n];
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        
        int p = scn.nextInt();
        int q = scn.nextInt();
        int[][] arr2 = new int[p][q];
        for (int i=0;i<p;i++) {
            for (int j=0;j<q;j++) {
                arr2[i][j] = scn.nextInt();
            }
        }
        
        if (m!= p || n != q) {
            System.out.println("-1");
        } else {
             int[][] ans = addTwoMatrix(arr1,m,n,arr2,p,q);
            for (int j=0;j<m;j++) {
                for (int k=0;k<n;k++) {
                    System.out.print(ans[j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
