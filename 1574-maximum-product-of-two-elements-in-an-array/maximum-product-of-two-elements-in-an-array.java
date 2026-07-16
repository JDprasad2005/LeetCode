class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],smax=0;
      for(int i=1;i<nums.length;i++){
        if(max<=nums[i]){
             smax=max;
            max=nums[i];
        }else if(nums[i]>smax && nums[i]<max){
            smax=nums[i];
        }
      }
      return (max-1)*(smax-1);
    }
}