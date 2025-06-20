class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
       int m=rolls.length;
       int sum=mean*(n+m);
       for(int num:rolls)
       {
        sum-=num;
       }
       if(sum<n || sum>6*n)
       {
        return new int[0];
       }
       int avg=sum/n;
       int rem=sum%n;
       int res[]=new int[n];
       for(int i=0;i<n;i++)
       {
            res[i]=avg;
            if(rem>0)
            {
                res[i]++;
                rem--;
            }
       }
        return res;
    }
}