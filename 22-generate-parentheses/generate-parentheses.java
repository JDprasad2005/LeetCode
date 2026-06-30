class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        para(n,0,0,ans,"");
        return ans;
    }
    
    static void para(int n, int o, int c,List<String> ans,String s){
        if(s.length()>=2*n){
            ans.add(s);
            return;
        }
        if(o<n){
            para(n,o+1,c,ans,s+"(");
        }
        if(c<o){
            para(n,o,c+1,ans,s+")");
        }
    }
    
}