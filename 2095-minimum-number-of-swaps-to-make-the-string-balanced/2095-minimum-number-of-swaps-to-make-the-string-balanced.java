class Solution {
    public int minSwaps(String s) {

       int imbalance=0;
       int swap=0;
      for(char ch:s.toCharArray())
        {
            if(ch=='[')
            {
                imbalance++;

            }
            else
            {
                if(imbalance>0)
                {
                    imbalance--;
                }
                else
                {
                    swap++;
        
                }
            }
        }
        return swap/2 + swap%2;
    }
}