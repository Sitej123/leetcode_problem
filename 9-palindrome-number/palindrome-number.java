class Solution {
    public boolean isPalindrome(int x) {
        int temp=Math.abs(x);
        int v=0;
        while(x!=0){
            int rem=x%10;
            v=v*10+rem;
            x/=10;
        }
        if(temp==v){
            return true;
        }
        return false;
    }
}