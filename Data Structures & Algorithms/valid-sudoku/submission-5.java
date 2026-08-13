class Solution {
    public boolean isValidSudoku(char[][] board) {
        int ROWS = board.length; // 9
        int COLS = board[0].length; // 9
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> col = new HashMap<>();
        HashMap<String, HashSet<Character>> squares = new HashMap<>();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                char num = board[i][j]; //[0,0]
                if(num == '.')
                continue;
                // checking for duplicate in rows
                HashSet<Character> rowValue = row.getOrDefault(i, new HashSet<>());
                if(rowValue.contains(num)){
                    return false;
                }else{
                    rowValue.add(num);
                    row.put(i,rowValue);
                }
                //checking for duplicates in cols
                HashSet<Character> colValue = col.getOrDefault(j, new HashSet<>());
                if(colValue.contains(num)){
                    return false;
                }else{
                    colValue.add(num);
                    col.put(j,colValue);
                }
                //checking for duplicates in squares
                String squareKey = String.valueOf(i/3)+ "," + String.valueOf(j/3);
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

// row: 0: {1,2,3}, 1:{4,5}, 2:{9,1,3}.
// col: 0: {1,4}, 1:{2,9}, 2:{1}, 3:{5}, 4:{3}, 8:{3}
// squares: "0,0":{1,2,4,9,1} "0,1":{3,5}