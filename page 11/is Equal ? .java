import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        
        boolean ans = false;
        for (int i=0;i<str1.length();i++) {
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                
                if (ch1 == ch2) {
                    ans = true;
                } else {
                    ans = false;
                    break;
                }
            
        }
        System.out.print(ans);
    }
}
