//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static int fib(int n){
        
        if(n<=1) return n;
        
        int a=0; 
        int b =1;
        int count =1;
        
        while(count<n){
            int sum = (a+b)%10;
            a=b;
            b=sum;
            count++;
        }
        return b;
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
            int N = Integer.parseInt(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fib(N));
        }
    }
}
// } Driver Code Ends