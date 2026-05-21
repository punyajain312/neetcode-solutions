class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = i + 1; j < nums.length; j++){
                int rem = -(nums[i] + nums[j]);
                if(map.containsKey(rem)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(rem);
                    Collections.sort(temp);
                    set.add(temp);
                }
                else{
                    map.put(nums[j], j);
                }
            }
        }

        for(List<Integer> l : set){
            res.add(l);
        }

        return res;
    }
}