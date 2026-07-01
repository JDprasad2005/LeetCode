class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        if( obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1)return 0;
        
        for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
                if( obstacleGrid[i][j]==1) obstacleGrid[i][j]=-1;
            }
        }

        int ans= paths(0,0,m,n,obstacleGrid);
        return ans;
    }
    
     static int paths(int i,int j,int m,int n,int[][] dp){
          
          if(i==m-1 && j==n-1){
              return 1;
          }
          if(dp[i][j]!=0 && dp[i][j]!=-1){
            return dp[i][j];
          }
          int down=0,right=0;
          if( i+1<m && dp[i+1][j]!=-1){
             down= paths(i+1,j,m,n,dp);
          }
           if(j+1<n && dp[i][j+1]!=-1 ){
             right= paths(i,j+1,m,n,dp);
          }
          
         return dp[i][j]=down + right;
    }
}