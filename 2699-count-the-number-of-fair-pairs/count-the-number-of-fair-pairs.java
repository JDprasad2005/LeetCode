class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=(upperBS(nums,i+1,upper-nums[i])-lowerBS(nums,i+1,lower-nums[i]));
        } return ans;
    }

    static int lowerBS(int[]nums,int i,int target){
        int j=nums.length-1;
        int ans=nums.length;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]>=target){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        } return ans;
    }

    static int upperBS(int[]nums,int i,int target){
        int j=nums.length-1;
        int ans=nums.length;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]>target){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        } return ans;
    }
}