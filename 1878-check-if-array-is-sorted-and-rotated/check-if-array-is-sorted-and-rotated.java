class Solution {
    public boolean check(int[] nums) {
       int i = 0;
       int drops = 0;
       int n = nums.length;
       for (i=0; i < n ; i++){
        if ( nums[i]> nums[ (i+1) % n]){
            drops++;
        }
        if (drops>1){
            return false;
        }
       }
       return true;
    }
}