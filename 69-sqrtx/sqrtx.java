class Solution {
    public int mySqrt(int x) {
        if(x==1)return 1;
        long i=0,j=x/2,res=0;
        while(i<=j){
            long mid=i+(j-i)/2;
            if(mid*mid==x)return (int)mid;
            else if(mid*mid<x){
                res=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        } return (int)res;
    }
}