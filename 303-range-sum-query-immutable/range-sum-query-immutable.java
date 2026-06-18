class NumArray {
      int[] arr;
    public NumArray(int[] nums) {
         this.arr=new int[nums.length+1];

         for(int i=1;i<this.arr.length;i++){
            this.arr[i]=this.arr[i-1]+nums[i-1];
         }
    }
    
    public int sumRange(int left, int right) {
       return this.arr[right+1]-this.arr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */