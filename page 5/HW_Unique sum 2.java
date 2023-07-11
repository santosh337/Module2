import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int[] freq = new int[100000];
        for (int i=0;i<n;i++) {
            freq[arr[i]]++;
        }
        int sum = 0;
        for (int i=0;i<freq.length;i++) {
            if (freq[i] == 1 && freq[i] != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
