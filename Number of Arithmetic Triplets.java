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
        
        int k = scn.nextInt();
        
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int p=j+1;p<n;p++){
                    if(arr[j]-arr[i]==k && arr[p] - arr[j] == k){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
