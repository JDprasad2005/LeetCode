class Solution {
    public int compress(char[] chars) {
          int i=0,c=1,j=1;
          if(chars.length==1)return 1;
        while(j<chars.length){
            if(chars[j]==chars[j-1])c++;
            else{
                chars[i++]=chars[j-1];
                if(c>1){
                     String s = String.valueOf(c);
                    for (char ch : s.toCharArray()) {
                        chars[i++] = ch;
                    }
                }
                c=1;
            }
            if(j==chars.length-1){
                chars[i++]=chars[j];
                if(c>1){
                     String s = String.valueOf(c);
                    for (char ch : s.toCharArray()) {
                        chars[i++] = ch;
                    }
                }
            }
            j++;
        } return i;
    }
}