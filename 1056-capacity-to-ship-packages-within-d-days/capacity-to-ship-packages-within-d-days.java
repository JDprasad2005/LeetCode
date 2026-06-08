class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int max=0,total=0;
          for(int i=0;i<nums.length;i++){
             max=Math.max(max,nums[i]);
             total+=nums[i];
          }
          int i=max,j=total,res=0,sum=0;
          while(i<=j){
            int mid=i+(j-i)/2;
            int d=1;
            sum=0;
            for(int k=0;k<nums.length;k++){
                 if(sum+nums[k]>mid){
                    sum=0; 
                    d++;
                 }
                 sum+=nums[k];
                //  if(d>days) break;
            }
            if(d<=days){
                res=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
          } return res;
    }
}