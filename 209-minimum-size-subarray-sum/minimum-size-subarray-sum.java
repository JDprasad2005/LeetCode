class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int  n = nums.length;
        int l = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for(int r = 0; r<n; r++){
             sum = sum + nums[r];
             while(sum >= target){
               minLength = Math.min(r-l+1, minLength);
               
                    sum = sum - nums[l];
                    l++;
             }
        }
        return minLength == Integer.MAX_VALUE ?0 : minLength;
    }
}