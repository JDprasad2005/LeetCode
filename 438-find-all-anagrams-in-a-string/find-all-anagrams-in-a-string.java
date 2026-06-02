class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()) return list;
          HashMap<Character,Integer> map1=new HashMap<>();
          HashMap<Character,Integer> map2=new HashMap<>();
          for(int i=0;i<p.length();i++){
            map1.put(p.charAt(i),map1.getOrDefault(p.charAt(i),0)+1);
          }
           
          for(int i=0;i<p.length();i++){
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
          }
           if( map1.equals(map2)) list.add(0);

           int i=0;
        for(int j=p.length();j<s.length();j++){
            map2.put(s.charAt(j),map2.getOrDefault(s.charAt(j),0)+1);
            if(map2.get(s.charAt(i))==1){
                 map2.remove(s.charAt(i));
            }else{
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)-1);
            } i++;
            if(map1.equals(map2)){
                list.add(i);
            }
        } return list;
    }
}