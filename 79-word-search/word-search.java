class Solution {
    public boolean exist(char[][] board, String word) {
          int m=board.length;
          int n=board[0].length;

        int[][] visited=new int[m][n];
        boolean ans=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                      ans=rat(board,word,m,n,i,j,0,visited);
                     if(ans) return true;
                }
            }
        }
        return ans;
    }
    
    static boolean rat(char[][] board,String word,int m,int n,int i,int j,int k, int[][] visited){
      
      if(k==word.length()-1){
          return true;
      }

       visited[i][j]=1;
       
      if(i+1<m && board[i+1][j]==word.charAt(k+1) && visited[i+1][j]==0){
          if(rat(board,word,m,n,i+1,j,k+1,visited))return true;
      }

      if(j-1>=0 && board[i][j-1]==word.charAt(k+1) && visited[i][j-1]==0){
          if(rat(board,word,m,n,i,j-1,k+1,visited))return true;
      }  
      
       if(j+1<n && board[i][j+1]==word.charAt(k+1) && visited[i][j+1]==0){
          if(rat(board,word,m,n,i,j+1,k+1,visited))return true;
      }  
    
      
      if(i-1>=0 && board[i-1][j]==word.charAt(k+1) && visited[i-1][j]==0){
          if(rat(board,word,m,n,i-1,j,k+1,visited))return true;
      }   
       visited[i][j]=0;
       return false;
    }
}