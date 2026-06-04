class Solution {
    public int longestOnes(int[] nums, int k) {
        int c=0;
        int l=0,max=0,mf=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0)c++;
            if(c>k){
                if(nums[l++]==0)c--;
            }
            max=Math.max(max,r-l+1);
        } return max;                                       
    }
}