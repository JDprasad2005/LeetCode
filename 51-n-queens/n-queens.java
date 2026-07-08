class Solution {
    public List<List<String>> solveNQueens(int n) {
          char[][] board =new char[n][n];
          for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
          }
          List<List<String>> ans=new ArrayList<>();
          f(n,0,0,board,new ArrayList<>(),ans);
          return ans;
    }

    static void f(int n,int i,int j,char[][] board,List<String> temp,List<List<String>> ans){
        if(i==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(j==n)return;

        if(check(i,j,board)){
            board[i][j]='Q';
            temp.add(String.valueOf(board[i]));
            f(n,i+1,0,board,temp,ans);
            board[i][j]='.';
            temp.remove(temp.size()-1);
        }
         f(n,i,j+1,board,temp,ans);
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