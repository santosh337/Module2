import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int[] arr=new int[n];
         
         for (int i=0;i<n;i++) {
             arr[i] = scn.nextInt();
         }
        int[] answer = new int[n];

        int leftSum = 0, rightSum = 0;
        for(int P : arr) rightSum += P;

        for(int idx=0; idx < n; idx++)
        {
            rightSum -= arr[idx]; 
            answer[idx] = Math.abs(leftSum-rightSum); 
            leftSum += arr[idx];                   
        }

        
        for (int j=0;j<n;j++) {
            System.out.print(answer[j]+" ");
        }
    }
}
