class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l=0,r=0,max=0;
        long mc=0,c=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        while(r<nums.length){
            if(nums[r]==max)mc++;
            while(l<=r && mc>=k){
                c+=(nums.length-r);
                if(nums[l++]==max)mc--;
            }
            r++;
        } return c;
    }
}