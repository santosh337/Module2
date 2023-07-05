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
        
        Arrays.sort(arr);
        
        if (arr[n/2 + 2] == arr[n/2+1]) {
            System.out.println(arr[n/2]);
        } else {
            System.out.println("NO MAJORITY ELEMENT");
        }
    }
}
