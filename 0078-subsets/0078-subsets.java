class Solution {
    public void makesubsets(int i,int[] nums,List<Integer> ds,List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
       ds.add(nums[i]);
        makesubsets(i+1,nums,ds,ans);
        ds.remove(ds.size()-1);
          makesubsets(i+1,nums,ds,ans);


    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        makesubsets(0,nums,new ArrayList<>(),ans);
        return ans;
        
    }
}