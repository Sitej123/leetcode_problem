class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] op=new int[2];
        
        for(int i=0;i<=nums.length-2;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(i!=j && nums[i]+nums[j]==target){
                    op[0]=j;
                    op[1]=i;
                }
            }
        }
        return op;
    }
}