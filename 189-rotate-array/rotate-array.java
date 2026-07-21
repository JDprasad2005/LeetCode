class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==nums.length) return;
        rev(nums,0,nums.length-k-1);
        rev(nums,nums.length-k,nums.length-1);
        rev(nums,0,nums.length-1);
    }

    static void rev(int[] nums,int i, int j){
        while(i<j){
           int temp=nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
           i++;
           j--;
        }
    }
}