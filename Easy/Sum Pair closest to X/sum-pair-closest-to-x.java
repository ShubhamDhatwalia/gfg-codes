//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            System.out.print(ans[0]+" "+ans[1]);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int x) {
        // code here 
        int closestSum = Integer.MAX_VALUE;
        int res[] = new int[2];
        int left =0;
        int right = arr.length-1;
        
        while(left<right){
            int sum = arr[left]+arr[right];
            
            if(Math.abs(x-sum) < Math.abs(x-closestSum)){
                closestSum = sum;
                res[0] = arr[left];
                res[1] = arr[right];
            }
            if(sum>x){
                right--;
            }
            else{
                left++;
            }
        }
        return res;
    }
}