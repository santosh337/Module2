import java.io.*;
import java.util.*;

public class Solution {
    
    public static void formSpiralMatrix(int arr[], int mat[][],int R,int C)
    {
        int top = 0,
            bottom = R - 1,
            left = 0,
            right = C - 1;
     
        int index = 0;
     
        while (true)
        {
            if (left > right)
                break;
     
            // print top row
            for (int i = left; i <= right; i++)
                mat[top][i] = arr[index++];
            top++;
     
            if (top > bottom)
                break;
     
            // print right column
            for (int i = top; i <= bottom; i++)
                mat[i][right] = arr[index++];
            right--;
     
            if (left > right)
                break;
     
            // print bottom row
            for (int i = right; i >= left; i--)
                mat[bottom][i] = arr[index++];
            bottom--;
     
            if (top > bottom)
                break;
     
            // print left column
            for (int i = bottom; i >= top; i--)
                mat[i][left] = arr[index++];
            left++;
        }
    }
    
    // Function to print the spiral matrix
    public static void printSpiralMatrix(int mat[][],int R,int C)
    {
        for (int i = 0; i < R; i++)
        {
            for (int j = 0; j < C; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[k];
        
        for (int i=0;i<k;i++) {
            arr[i] = scn.nextInt();
        }
        
        int[][] sparr = new int[m][n];
        formSpiralMatrix(arr, sparr,m,n);
        printSpiralMatrix(sparr,m,n);
    }
}
