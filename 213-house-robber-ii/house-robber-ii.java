class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
           int[] dp=new int[nums.length];
            Arrays.fill(dp,-1);
            int ignoreLast = f(nums,0,nums.length-1,dp);
            Arrays.fill(dp,-1);
            int ignoreFirst = f(nums,1,nums.length,dp);
            return Math.max(ignoreLast,ignoreFirst);
    }

    static int f(int[] nums,int i,int n,int[] dp){
       if(i>=n) return 0;
       if(dp[i]!=-1) return dp[i];

       int take=nums[i]+f(nums,i+2,n,dp);
       int notTake=f(nums,i+1,n,dp);

    return dp[i]=Math.max(take,notTake);
   }
}