class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans= paths(0,0,m,n,dp);
        return ans;
    }
    
     static int paths(int i,int j,int m,int n,int[][] dp){
          if(i==m-1 && j==n-1){
              return 1;
          }
          if(dp[i][j]!=-1){
            return dp[i][j];
          }
          int down=0,right=0;
          if(i+1<m){
             down= paths(i+1,j,m,n,dp);
          }
           if(j+1<n){
             right= paths(i,j+1,m,n,dp);
          }
          
         return dp[i][j]=down + right;
    }
}