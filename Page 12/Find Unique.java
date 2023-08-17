import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        int[] freq = new int[10];
        for (int i=0;i<str1.length();i++) {
            char ch = str1.charAt(i);
            int convert = ch - '0';
            freq[convert]++;
        }
        int count = 0;
        for (int val: freq) {
            if (val!=0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
