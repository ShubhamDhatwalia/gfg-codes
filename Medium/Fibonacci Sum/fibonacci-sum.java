//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    static long fibSum(long N){
        //code here
        ArrayList<Long> list = new ArrayList();
        if(N<=1) return N;
        int mod = 1000000007;
        long a =0;
        long b=1;
        list.add(a);
        int count =1;
        while(count<=N){
            list.add(b);
            long sum = (a+b)%mod;
            a=b;
            b= sum;
            count++;
        }
        long sum =0;
        for(long num:list){
            sum= (sum+num)%mod;
        }
        return sum;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends