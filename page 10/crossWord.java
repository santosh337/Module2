import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean dirOne(char[][] arr, String word ,int i ,int j)
    {
        // horizontal from left to right 
        
        for (int k=0;k<word.length();k++) {
            if (j >= arr.length) {
                return false;
            } else if (word.charAt(k) != arr[i][j]) {
                return false;
            }
            j++;
        }
        return true;
    }    
    
     public static boolean dirTwo(char[][] arr, String word ,int i ,int j)
    {
        // horizontal from left to right 
        
        for (int k=0;k<word.length();k++) {
            if (i >= arr.length) {
                return false;
            } else if (word.charAt(k) != arr[i][j]) {
                return false;
            }
            i++;
        }
        return true;
    }    
    
    public static boolean dirThree(char[][] arr, String word ,int i ,int j)
    {
        // horizontal from left to right 
        
        for (int k=0;k<word.length();k++) {
            if (i >= arr.length || j >= arr.length) {
                return false;
            } else if (word.charAt(k) != arr[i][j]) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }    
    
    public static boolean dirFour(char[][] arr, String word ,int i ,int j)
    {
        // horizontal from left to right 
        
        for (int k=0;k<word.length();k++) {
            if (i >= arr.length || j < 0) {
                return false;
            } else if (word.charAt(k) != arr[i][j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }    
    
    public static boolean searchin4Dir(char[][] arr, String word ,int i ,int j) {
        
        // better for loop it only checks for one true condition . 
        if (dirOne(arr,word,i,j) || dirTwo(arr,word,i,j) || dirThree(arr,word,i,j) || dirFour(arr,word,i,j)) {
            return true;
        } 
        
        // boolean a1 = dirOne(A,word,i,j);
        // boolean a2 = dirTwo(A,word,i,j);
        // boolean a3 = dirThree(A,word,i,j);
        // boolean a4 = dirFour(A,word,i,j);
        // if (a1 || a2 || a3 || a4) {
        //     return true;
        // }  // this one checks for the all the direction and then returns answer 
        
        
        return false;
    }
    
    public static boolean crossword(char[][] arr, String word) {
        int n = arr.length;
        char first = word.charAt(0);
        
        for (int j=0;j<n;j++) {
            for (int k=0;k<n;k++) {
                if (arr[j][k] == first) {
                    boolean dirAns = searchin4Dir(arr,word,j,k);
                    if (dirAns) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char[][] arr = new char[n][n];
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = scn.next().charAt(0);
            }
        }
        
        String word = scn.next(); // Actual word to find . 
        
        boolean ans = crossword(arr,word);
        System.out.println(ans);
    }
}
