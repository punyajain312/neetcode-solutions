class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, maxf = 0, maxLen = 0;
        int[] hash = new int[26];

        for(int r = 0; r < s.length(); r++){
            hash[s.charAt(r) - 'A']++;
            maxf = Math.max(hash[s.charAt(r) - 'A'], maxf);

            if((r - l + 1) - maxf > k){
                hash[s.charAt(l) - 'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}
