class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          List<List<Integer>> ans=new ArrayList<>();
          Arrays.sort(nums);
           subsets(nums,0,new ArrayList<>(),ans);
           return ans;
    }

    static void subsets(int[] nums,int i,List<Integer> temp,List<List<Integer>> ans ) {
         if(i>=nums.length){
            if(!ans.contains(temp))
            ans.add(new ArrayList<>(temp));
            return;
         }
         temp.add(nums[i]);
         subsets(nums,i+1,temp,ans);
         temp.remove(temp.size()-1);
         subsets(nums,i+1,temp,ans);
    }
}