class Solution {
    public int findPairs(int[] nums, int k) {
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }
     int c=0;
        if(k==0){
            for(int key:map.keySet()){
                if(map.get(key)>=2) c++;
            }
        }else{
            for(int key:map.keySet()){
                if(map.containsKey(key+k))c++;
            }
        } return c;
    } 
}