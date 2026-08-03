class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set= new HashSet<>();
        int i=0,j=0;
        long sum=0,max=0;
        while(j<nums.length){
           while(!set.add(nums[j])){
               set.remove(nums[i]);
               sum-=nums[i++];
           }

           sum+=nums[j];

           if(set.size()==k){
             max=Math.max(sum,max);
             set.remove(nums[i]);
             sum-=nums[i++];
           }

           j++;
        } 
        return max;
    }
}