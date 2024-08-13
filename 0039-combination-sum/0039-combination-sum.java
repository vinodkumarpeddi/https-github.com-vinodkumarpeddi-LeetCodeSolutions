import java.util.ArrayList;
import java.util.List;

class Solution {
    public void makeCombination(int[] candidates, int target, int i, List<Integer> comb, List<List<Integer>> res) {
        if (i == candidates.length) {
            if (target == 0) {
                res.add(new ArrayList<>(comb)); // Add the combination to the result
            }
            return;
        }
        if (candidates[i] <= target) {
            comb.add(candidates[i]);
            makeCombination(candidates, target - candidates[i], i, comb, res); // Include the current element
            comb.remove(comb.size() - 1); // Backtrack
        }
        makeCombination(candidates, target, i + 1, comb, res); // Move to the next element
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        makeCombination(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
}
