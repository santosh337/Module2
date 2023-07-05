import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer arr[] = new Integer[n];
        
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int trueCount = 0;
        for (int st=0;st<n;st++) {
           for (int end = st;end<n;end++) {
               if (arr[st] + arr[end] == 0) {
                   trueCount++;
                   break;
               }
           }
        }
        
        if (trueCount>0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
