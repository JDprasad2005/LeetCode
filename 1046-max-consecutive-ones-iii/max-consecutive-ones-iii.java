class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l= 0;
        int zeroes = 0;
        int maxLength = 0;
        for(int r = 0; r<n; r++){
            if(nums[r] == 0){
                zeroes++;
            }
            while(zeroes > k){
               if(nums[l] == 0){
                zeroes--;
               } 
               l++;
            }
            int len = r-l+1;
            maxLength = Math.max(len, maxLength);
        }
        return maxLength;
    }
}