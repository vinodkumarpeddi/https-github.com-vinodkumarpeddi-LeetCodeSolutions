class Solution {
    public int longestSubarray(int[] nums) {
        int maxele=0;
        for(int num:nums)
        {
            maxele=Math.max(maxele,num);
        }
        int maxlen=0;
        int currentlen=0;
        for(int num:nums)
        {
            if(num==maxele)
            {
                currentlen++;
                maxlen=Math.max(maxlen,currentlen);
            }
            else
            {
                currentlen=0;
            }
        }
        return maxlen;
    }
}