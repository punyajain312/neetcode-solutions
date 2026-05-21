class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new Set[board.length];
        Set<Character>[] col = new Set[board.length];
        Set<Character>[] box = new Set[board.length];

        for(int i = 0; i < board.length; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                char c = board[i][j];

                if(c == '.') continue;

                if(!row[i].add(c)) return false;
                if(!col[j].add(c)) return false;

                int ind = (i / 3) * 3 + (j / 3);
                if(!box[ind].add(c)) return false;
            }
        }

        return true;
    }
}
