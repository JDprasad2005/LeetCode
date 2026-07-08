class Solution {
    public int totalNQueens(int n) {
        char[][] board =new char[n][n];
          for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
          }
         return f(n,0,0,board);
         
    }

    static int f(int n,int i,int j,char[][] board){
        if(i==n){
            return 1;
        }
        if(j==n)return 0;
         int c=0;
        if(check(i,j,board)){
            board[i][j]='Q';
        c+=f(n,i+1,0,board);
            board[i][j]='.';
        }
        c+=f(n,i,j+1,board);
        return c;
    }

    static boolean check(int i,int j,char[][] board){
        int r=i,c=j;
        while(r>=0){
            if(board[r][c]=='Q') return false;
            r--;
        }
          r=i;
          c=j;
         while(r>=0 && c>=0){
            if(board[r][c]=='Q') return false;
            r--;
            c--;
        }

          r=i;
          c=j;
         while(r>=0 && c<board.length){
            if(board[r][c]=='Q') return false;
            r--;
            c++;
        } return true;
    }
}