class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String elements[]=new String[n];
        for(int i=0;i<n;i++)
        {
            elements[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(elements,new Comparator<String>(){
             public int compare(String a,String b)
             {
                String f=a+b;
                String s=b+a;
                return s.compareTo(f);
             }
        });
        if(elements[0].equals("0"))
        {
            return "0";
        }
        StringBuilder st=new StringBuilder();
        for(String val:elements)
        {
            st.append(val);
        }
        return st.toString();

    }
}