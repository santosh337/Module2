import java.io.*;
import java.util.*;

public class Solution {
    
    public static void reverseID(int[][] arr,int row) {
        int i = 0;
        int j = arr[0].length - 1;
        while (i<j) {
            int temp = arr[row][i];
            arr[row][i] = arr[row][j];
            arr[row][j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int[][] arr = new int[k][k];
        for (int i=0;i<k;i++) {
            for (int j=0;j<k;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        for (int j=0;j<k;j++) {
            reverseID(arr,j);
        }
        
        for (int i=0;i<k;i++) {
            for (int j=0;j<k;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
