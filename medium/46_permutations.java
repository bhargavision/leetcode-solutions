//backtracking and recursion
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,res,new ArrayList(), boolean[nums.length]);
        return res;
    }

    static void backtrack(int[] nums, List<List<Integer>> res, List<Integer> tempList, boolean[] used) {
        if (tempList.size() == nums.length) {
            res.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(nums, res, tempList, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}