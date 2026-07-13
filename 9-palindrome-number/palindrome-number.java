class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int v=0;
        while(x!=0){
            v=v*10+(x%10);
            x=x/10;
        }
        if(Math.abs(temp)==v){
            return true;
        }
        return false;
    }
}