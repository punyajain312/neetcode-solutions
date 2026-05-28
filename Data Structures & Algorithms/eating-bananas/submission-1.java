class Solution {
    public boolean isPossible(int k, int[] piles, int h){
        for(int i = 0; i < piles.length; i++){
            if(piles[i] % k == 0) h -= piles[i] / k; 
            else h -= piles[i] / k + 1;
        }
        return h >= 0;
    }

    public int minEatingSpeed(int[] piles, int ho) {
        int max = piles[0];
        for(int i = 1; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        int l = 1, h = max;
        while(l < h){
            int mid = l + (h - l) / 2;
            if(isPossible(mid, piles, ho)){
                h = mid;
            }
            else l = mid + 1;
        }

        return l;
    }
}
