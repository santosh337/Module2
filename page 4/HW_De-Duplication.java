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
        
        int fillindex=0;

        int len=0;

        for(int i=0;i<arr.length;i++)
        {
            int startindex=i;
           
            while(i<arr.length-1 && arr[i] == arr[i+1])
            {
                i++;
            }

            len = (i-startindex)+1;

            int counter = Math.min(len,2);

            while(counter>0 )
            {
                arr[fillindex]=arr[startindex];
                counter--;
                fillindex++;
            }
        }
        System.out.println(fillindex);
    }
}
