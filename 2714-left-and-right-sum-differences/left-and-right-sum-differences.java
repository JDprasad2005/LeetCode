class Solution {
    public int[] leftRightDifference(int[] nums) {
         int[] res=new int[nums.length];
         int suf=0,pre=0;
         for(int i=0;i<nums.length;i++){
            res[i]=pre;
            pre+=nums[i];
         }
         for(int i=nums.length-1;i>=0;i--){
            res[i]=Math.abs(res[i]-suf);
            suf+=nums[i];
         }
         return res;

    }
}