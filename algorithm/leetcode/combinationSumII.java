package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class combinationSumII {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) return res;        
        Arrays.sort(candidates);

        helper(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> list, int[] candidates, int target, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if(target<0)return;
        for (int i = start; i< candidates.length; i++) {
        	if(i!=start && candidates[i]==candidates[i-1]) continue;
            list.add(candidates[i]);
            helper(res, list, candidates, target - candidates[i], i+1);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int nums[]= {2,5,2,1,2};
    	
        combinationSumII one=new combinationSumII();
        one.combinationSum(nums,5);
	}
}
