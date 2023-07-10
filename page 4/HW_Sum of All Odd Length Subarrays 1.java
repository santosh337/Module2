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
        int sum = 0;
        int count = 0;
        int finalSum = 0;
        for (int st=0;st<n;st++) {
           for (int end = st;end<n;end++) {
               count = 0;
               sum = 0;
               for (int k=st;k<=end;k++) {
                   count++;
                    sum += arr[k];
               }
              if (count%2 ==1) {
                  finalSum += sum;
              }
           }
        }
         System.out.println(finalSum);
    }
}
