class Solution {
    public boolean isValidSudoku(char[][] board) {
        int ROW = board.length;
        int COL = board[0].length;
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> col = new HashMap<>();
        HashMap<String, HashSet<Character>> squares = new HashMap<>();
        for(int i = 0; i<ROW; i++){
            for(int j=0; j<COL; j++){
                char num = board[i][j];
                if(num == '.')
                continue;

                HashSet<Character> rowValue = row.getOrDefault(i, new HashSet<>());
                if(rowValue.contains(num)){
                    return false;
                }else{
                    rowValue.add(num);
                    row.put(i,rowValue);
                }

                HashSet<Character> colValue = col.getOrDefault(j, new HashSet<>());
                if(colValue.contains(num)){
                    return false;
                }else{
                    colValue.add(num);
                    col.put(j,colValue);
                }

                String squareKey = String.valueOf(i/3) + "," + String.valueOf(j/3);
                HashSet<Character> squareValue = squares.getOrDefault(squareKey, new HashSet<>());

                if(squareValue.contains(num)){
                    return false;
                }else{
                    squareValue.add(num);
                    squares.put(squareKey, squareValue);
                }
            }
        }
        return true;
    }
}
