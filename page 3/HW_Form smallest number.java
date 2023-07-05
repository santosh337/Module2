import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [] arr = new int[n];
        
        for (int j=0;j<n;j++) {
            arr[j] = scn.nextShort();
        }
        
        String str[] = new String[n];
        
        for (int i=0;i<n;i++) {
            str[i] = "" + arr[i];
        }
        
        Arrays.sort(str,(a,b) -> {
            String s = a + b;
            String r = b + a;
            return s.compareTo(r);
        });
        String ans = "";
        
        for (int a =0;a<n;a++) {
            ans += str[a];
        }
        System.out.println(ans);
    }
}
