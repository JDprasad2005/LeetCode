class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int net=0,fuel=0,s=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            fuel+=diff;
             if(fuel<0){
                s=i+1;
                fuel=0;
            }
             net+=diff;
        }if(net<0)return -1;
        else return s;
    }
}