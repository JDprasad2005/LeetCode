class Solution {
    public int[][] merge(int[][] nums) {
 ArrayList<int[]> list=new ArrayList<>();
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        int s=1,e=0;
        int el1=nums[0][0];
        int el2=nums[0][1];
        while(s<nums.length){
           if(nums[s][0]<=el2){
            el2=Math.max(el2,nums[s][1]);
           }else{
            list.add(new int[]{el1,el2});
            el1=nums[s][0];
            el2=nums[s][1];
           }
              e++;
              s++;
        }
        list.add(new int[]{el1,el2});

        int[][] ans = list.toArray(new int[0][]);
        return ans;
      }
}