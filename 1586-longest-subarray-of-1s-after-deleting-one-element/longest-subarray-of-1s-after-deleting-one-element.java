class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,max=0,fl=0;
        while(j<nums.length){
            while(nums[j]==0 && fl==1){
                if(nums[i++]==0) fl=0;
            }
            if(nums[j]==0 && fl==0) fl=1;
            max=Math.max(max,j-i);
            j++;
        }
        return max;
    }
}