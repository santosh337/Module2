import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        
        for (int i=0;i<str1.length();i++) {
            char ch1 = str1.charAt(i);
            System.out.print(ch1+"\t");
        }
    }
}
