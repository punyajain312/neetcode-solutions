class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int num : stones){
            pq.add(num);
        }

        while(!pq.isEmpty() && pq.size() > 1){
            int s1 = pq.poll();
            int s2 = pq.poll();

            if(s1 == s2) continue;
            pq.add(Math.abs(s1 - s2));
        }

        return pq.size() == 0 ? 0 : pq.peek();
    }
}
