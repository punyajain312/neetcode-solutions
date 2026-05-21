class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < nums.length + 1; i++){
            freq[i] = new ArrayList<>();
        }

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int ind = 0;
        for(int i = freq.length - 1; i > 0 && ind < k; i--){
            for(int n : freq[i]){
                if(ind < k){
                    res[ind++] = n;
                }
            }
        }

        return res;
    }
}
