class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        Arrays.sort(nums,(a,b)->a[1]-b[1]);
        int c=0;
        int prev=nums[0][1];
        for(int i=1;i<nums.length;i++){
            if(nums[i][0]<prev){
                c++;
            }else{
                prev=nums[i][1];
            }
        }  return c;
   }
}