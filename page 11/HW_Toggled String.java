import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        
        boolean ans = false;
        
        if (str1.length() != str2.length()) {
            System.out.print(ans);
            return;
        }
        
        for (int i=0;i<str1.length();i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if ((Character.isUpperCase(ch1) && Character.isLowerCase(ch2)) || (Character.isLowerCase(ch1) && Character.isUpperCase(ch2))) {
                ans = true;
            } else {
                ans = false;
                break;
            }
            
        }
        System.out.print(ans);
    }
}
