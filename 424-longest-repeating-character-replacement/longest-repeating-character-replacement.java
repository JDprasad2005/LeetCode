class Solution {
    public int characterReplacement(String s, int k) {
         HashMap<Character,Integer> map=new HashMap<>();
         int l=0,mf=0,max=0;
         for(int r=0;r<s.length();r++){
              map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
              mf=Math.max(mf,map.get(s.charAt(r)));
              while((r-l+1-mf)>k){
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
              }
              max=Math.max(max,r-l+1);
         }return max;
    }
}