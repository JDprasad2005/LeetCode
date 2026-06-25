class Solution {
    public int[][] insert(int[][] arr, int[] newInt) {
        // if(nums.length==0){
        //     return new int[][]{newInt};
        // }
        // List<int[]> list= new ArrayList<>();
        // int e1=nums[0][0];
        // int e2=nums[0][1];
        // int s=1,fl=0;
        // while(s<nums.length){
        //     if(nums[s][0]<=e2){
        //         e2=Math.max(e2,nums[s][1]);
        //         s++;
        //     }else if(newInt[0]<=e2 && fl==0){
        //         e1=Math.min(e1,newInt[0]);
        //         e2=Math.max(e2,newInt[1]);
        //         fl=1;
        //     }else{
        //      list.add(new int[]{e1,e2});
        //      e1=nums[s][0];
        //      e2=nums[s][1];
        //      s++;
        //   }
        // }
        // list.add(new int[]{e1,e2});

        // return list.toArray(new int[0][]);

         ArrayList<int[]> list=new ArrayList<>();
         int[][] nums=new int[arr.length+1][2];
         for(int i=0;i<arr.length;i++){
                nums[i][0]=arr[i][0];
                nums[i][1]=arr[i][1];
         }
         nums[arr.length][0]=newInt[0];
         nums[arr.length][1]=newInt[1];
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