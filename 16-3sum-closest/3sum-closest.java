class Solution {
    public int threeSumClosest(int[] nums, int target) {
          Arrays.sort(nums);
           int sum=0,min=Integer.MAX_VALUE,ans=0;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k=nums.length-1;
            while(j<k){
               sum=nums[i]+nums[j]+nums[k];
               if(Math.abs(target-sum)<min){
                  ans=sum;
                  min=Math.abs(target-sum);
               }
               if(sum<target)j++;
               else k--;
            }
        } return ans;
    }
}