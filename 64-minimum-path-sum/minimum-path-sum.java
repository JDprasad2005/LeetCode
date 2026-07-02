class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(grid,0,0,m,n,dp);
    }

    static int f(int[][] grid,int i,int j,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1){
           return grid[i][j];
        }
        if(dp[i][j]!=-1){
          return dp[i][j];
        }

        int down=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
        
        if(i+1<m){
            down= f(grid,i+1,j,m,n,dp);
        }

        if(j+1<n){
            right= f(grid,i,j+1,m,n,dp);
        }

       return dp[i][j]= grid[i][j]+Math.min(down,right);
        
    }
}