class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for(char c : s.toCharArray()){
            smap.put(c, smap.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        return tmap.equals(smap);
    }
}
