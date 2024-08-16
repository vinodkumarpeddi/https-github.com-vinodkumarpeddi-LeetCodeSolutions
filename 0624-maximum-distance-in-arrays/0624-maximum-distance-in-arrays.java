class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
      int maxdistance=0;
      int minele=arrays.get(0).get(0);
      int maxele=arrays.get(0).get(arrays.get(0).size()-1);
      for(int i=1;i<arrays.size();i++)
      {
          List<Integer> current=arrays.get(i);
          int currentmin=current.get(0);
             int currentmax=current.get(current.size()-1);
             maxdistance=Math.max(maxdistance,Math.abs(maxele-currentmin));
               maxdistance=Math.max(maxdistance,Math.abs(currentmax-minele));
               minele=Math.min(currentmin,minele);
               maxele=Math.max(maxele,currentmax);
      }
   return maxdistance;

      }
    
}