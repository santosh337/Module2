import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int p = 0;p<n;p++) {
            int testCase = scn.nextInt();
            int arr[] = new int[testCase];
        
        for (int i=0;i<testCase;i++) {
            arr[i] = scn.nextInt();
        }

    int insertPos = 0;
    for (int num: arr) {
        if (num != 0) arr[insertPos++] = num;
    }        

    while (insertPos < arr.length) {
        arr[insertPos++] = 0;
    } 
    
    for (int k =0 ;k<testCase;k++) {
        System.out.print(arr[k]+" ");
    }
            System.out.println();
        }
    }
}
