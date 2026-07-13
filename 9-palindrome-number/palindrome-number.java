class Solution {
    public boolean isPalindrome(int x) {
        int temp=Math.abs(x);
        int v=0;
        while(true){
            if(x==0){
                break;
            }
            v=v*10+(x%10);
            x/=10;
        }
        if(temp==v){
            return true;
        }
        return false;
    }
}