class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
             map1.put(map.get(key),map1.getOrDefault(map.get(key),0)+1);
        }

         for(int num:nums){
          if(map1.get(map.get(num))==1) return num;
        }
        return -1;
    }
}