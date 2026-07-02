class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n];
      return  climb(n,0,dp);
    }
       
       static int climb(int n,int cur,int[] dp){
        if(cur==n) return 1;
        if(cur>n) return 0;

        if(dp[cur]!=0) return dp[cur];

        int one=0,two=0;

       one= climb(n,cur+1,dp);
       two=climb(n,cur+2,dp);
       return dp[cur]=one+two;
       }
    }