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
        
        for (int st=0;st<n;st++) {
           for (int end = st;end<n;end++) {
               for (int k=st;k<=end;k++) {
                   System.out.print(arr[k]+" ");
               }
               System.out.println();
           }
        }
    }
}
