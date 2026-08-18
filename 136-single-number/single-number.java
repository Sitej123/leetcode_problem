class Solution {
    public int singleNumber(int[] nums) {
        int i=0;
        int count;
        while(i<nums.length){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
            i++;
        }
        return 0;
    }
}