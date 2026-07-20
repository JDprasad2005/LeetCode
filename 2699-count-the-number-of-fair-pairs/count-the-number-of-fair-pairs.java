class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countMost(nums,upper)-countMost(nums,lower-1);
    }

    static long countMost(int[]nums,int k){
       int j=nums.length-1;
       long ans=0;
       for(int i=0;i<j;i++){
          while(i<j && nums[i]+nums[j] > k) j--;
          ans+=j-i;
       } return ans;
    }
}