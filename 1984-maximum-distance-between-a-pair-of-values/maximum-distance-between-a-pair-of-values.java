class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0,j=0,max=0;
        while(j<nums2.length && i<nums1.length){
            if(nums1[i]<=nums2[j]){
                max=Math.max(j-i,max);
                j++;
            }else{
                if(i>=j)j++;
                i++;
            }
        } return max;
    }
}