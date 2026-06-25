class Solution {
    public int[][] insert(int[][] nums, int[] newInt) {
        if(nums.length==0){
            return new int[][]{newInt};
        }
        List<int[]> list= new ArrayList<>();
        int s=0;
        while(s<nums.length && newInt[0]>nums[s][1]){
            list.add(new int[]{nums[s][0],nums[s][1]});
            s++;
        }
        while(s<nums.length && nums[s][0]<=newInt[1] ){
               newInt[0]=Math.min(nums[s][0],newInt[0]);
               newInt[1]=Math.max(nums[s][1],newInt[1]);
               s++;
        }
        list.add(newInt);
        while(s<nums.length){
            list.add(new int[]{nums[s][0],nums[s][1]});
            s++;
        }
       return list.toArray(new int[0][]);
    }
}