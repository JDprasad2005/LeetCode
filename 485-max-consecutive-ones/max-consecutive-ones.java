class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int l = 0;
        int maxLength = 0;
         for(int r = 0; r<n; r++){
            if(nums[r] == 0){
             l = r+1;
            }
            int len = r-l+1;
            maxLength = Math.max(len, maxLength);
         }
         return  maxLength;
       }
 }
