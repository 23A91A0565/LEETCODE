class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[tiles.length()]; 
        permutation(tiles, set, sb, used);
        return set.size();
    }
    private void permutation(String tiles, HashSet<String> set, StringBuilder sb, boolean[] used) {
        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) continue; 
            used[i] = true;
            sb.append(tiles.charAt(i));
            set.add(sb.toString());
            permutation(tiles, set, sb, used);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false; 
        }
    }
}