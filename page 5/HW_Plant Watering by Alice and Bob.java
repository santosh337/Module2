import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int capA = scn.nextInt();
        int capB = scn.nextInt();
        // Logic part .
        int a = 0;
        int b = arr.length-1;
        int count = 0;
        
        int tempCapA = capA;
        int tempCapB = capB;
        
        while (a < b) {
            if (arr[a] <= tempCapA) {
                tempCapA -= arr[a];
            } else {
                tempCapA = capA;
                tempCapA -= arr[a];
                count++;
            }
            
            if (arr[b] <= tempCapB) {
                tempCapB -= arr[b];
            } else {
                tempCapB = capB;
                tempCapB -= arr[b];
                count++;
            }
            a++;
            b--;
        }
        System.out.println(count);
    }
}
