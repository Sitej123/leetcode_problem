// Source - https://stackoverflow.com/a/59029832
// Posted by Eran, modified by community. See post 'Timeline' for change history
// Retrieved 2026-07-28, License - CC BY-SA 4.0

class Solution {
    public int reverse(int x) {
        long ans = 0;
        while(x != 0) {
            ans = ans * 10 + (x % 10);
            x /= 10;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) ans;
        }
    }
}
