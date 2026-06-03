class Solution {
    public int totalFruit(int[] f) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,max=0;
        for(int r=0;r<f.length;r++){
            map.put(f[r],map.getOrDefault(f[r],0)+1);
            while(map.size()>2){
                if(map.get(f[l])==1) map.remove(f[l++]);
                else map.put(f[l],map.getOrDefault(f[l++],0)-1);
            }
            max=Math.max(max,r-l+1);
        } return max;
    }
}