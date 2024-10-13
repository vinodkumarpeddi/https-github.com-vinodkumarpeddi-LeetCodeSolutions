class Solution {
    public int[] countBits(int n) {
         int ans[] = new int[n+1];
        for (int a = 1; a <= n; a++) {
            int count = 0;
            int num = a;
            
            while (num > 0) {
                count += (num & 1); 
                num >>= 1;  
            }
            
            ans[a] = count;  
        }
        return ans;
    }
}