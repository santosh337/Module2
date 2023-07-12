import java.io.*;
import java.util.*;

public class Solution {

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
        
        int c[][]=new int[m][q];  //3 rows and 3 columns  
        if (n == p) {
            //multiplying and printing multiplication of 2 matrices    
        for(int i=0;i<m;i++){    
            for(int j=0;j<q;j++){    
                c[i][j]=0;      
                    for(int k=0;k<n;k++)      
                        {      
                            c[i][j]+=arr1[i][k]*arr2[k][j];      
                        }//end of k loop  
                            System.out.print(c[i][j]+" ");  //printing matrix element  
                        }//end of j loop  
                        System.out.println();//new line    
            }    
        } else {
            System.out.println("-1");
        }
    }
}
