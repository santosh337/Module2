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
        
        int maxCandy = 0 ;
        for(int candy: arr) {
            if(candy > maxCandy) {
               maxCandy = candy;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int currentCandy : arr) {
            if(currentCandy + k >= maxCandy) {
                System.out.print("true" +" ");
            } else {
                System.out.print("false" +" ");
            }
        }
    }
}
