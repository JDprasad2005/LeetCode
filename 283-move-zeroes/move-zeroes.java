class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0) break;
        }

        for(int j=i+1;j<nums.length;j++){
            if(nums[j]!=0){
                swap(nums,i++,j);
            }
        }
    }

    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    } 
}