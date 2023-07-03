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
        
        Arrays.sort(arr,(a,b) -> a*a - b*b);
        
        for (int j=0;j<n;j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
