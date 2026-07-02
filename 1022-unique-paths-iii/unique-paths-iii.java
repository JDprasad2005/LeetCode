class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int st_i=0,st_j=0,obsCount=0;
        int[][] visited=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    st_i=i;
                    st_j=j;
                }
                if(grid[i][j]==-1){
                    obsCount++;
                }
            }
    }   return paths(grid,m,n,st_i,st_j,visited,obsCount);
    }

    static int paths(int[][] grid,int m,int n,int i,int j,int[][] visited,int vc){
        if(grid[i][j]==2){
            if(vc+1==m*n){
                 return 1;
            } return 0;
        }
          visited[i][j]=1;
        int right=0,left=0,down=0,up=0;
        if(j+1<n && grid[i][j+1]!=-1 && visited[i][j+1]!=1){
            right= paths(grid,m,n,i,j+1,visited,vc+1);
        }

         if(i+1<m && grid[i+1][j]!=-1 && visited[i+1][j]!=1){
            down= paths(grid,m,n,i+1,j,visited,vc+1);
        }

         if(j-1>=0 && grid[i][j-1]!=-1 && visited[i][j-1]!=1){
            left= paths(grid,m,n,i,j-1,visited,vc+1);
        }

         if(i-1>=0 && grid[i-1][j]!=-1 && visited[i-1][j]!=1){
            up= paths(grid,m,n,i-1,j,visited,vc+1);
        }
         
         visited[i][j]=0;
        return right+down+left+up;
    }
}