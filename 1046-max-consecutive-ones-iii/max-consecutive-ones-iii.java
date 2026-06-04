class Solution {
    public int longestOnes(int[] nums, int k) {
        int c=0;
        int l=0,max=0,mf=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1)c++;
            mf=Math.max(mf,c);
            if(r-l+1-mf>k){
                if(nums[l++]==1)c--;
            }
            max=Math.max(max,r-l+1);
        } return max;                                       
    }
}