class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
          if(k==0 || k==1) return 0;
        int l=0,pro=1,c=0;
        for(int r=0;r<nums.length;r++){
             pro*=nums[r];
             while(l<=r && pro>=k){
                pro/=nums[l++];
             }
             if(l<=r)c+=(r-l+1);
        } return c;
    }
}