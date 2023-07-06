import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        int[] freq = new int[26];
        
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
            
        // find max freq 
        int maxFreq = -1;
        char ans = '#';
        
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (freq[ch-'a'] > maxFreq)
            {
                maxFreq = freq[ch-'a'];
                ans = ch;
            }        
        }
        System.out.println(ans);
     }
}
