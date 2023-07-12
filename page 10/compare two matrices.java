import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean compare(int[][] arr1,int m,int n ,int[][] arr2,int p, int q) {
        if (m != p || n != q) {
            return false;
        }
        
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
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
        
        boolean ans = compare(arr1,m,n,arr2,p,q);
        if (ans) {
            System.out.println("Same");
        }  else {
            System.out.println("Not Same");
        }
    }
}
