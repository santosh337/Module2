import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                
            } else {
                System.out.print(i+" ");
            }
        }
    }
}
