class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        else{
            int i=0;
            while(i<nums.length){
                int count=0;
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
        }
        return 0;
    }
}