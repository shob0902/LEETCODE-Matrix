class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> map=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                char x=board[i][j];
                if(x!='.'){
                    if(!map.add(x+"in row"+i)||!map.add(x+"in col"+j)||!map.add(x+"from"+i/3+"to"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
