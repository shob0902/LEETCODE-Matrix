class Solution {
    public void gameOfLife(int[][] board) {
        int[][] direc={{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1},{0,1},{1,1}};
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int live=0;
                for(int[] dir:direc){
                    int x=i+dir[0];
                    int y=j+dir[1];
                    if(x>=0&&x<r&&y>=0&&y<c&&Math.abs(board[x][y])==1){
                        live++;
                    }
                }
                if(board[i][j]==1&&(live<2||live>3)){
                    board[i][j]=-1;
                }
                if(board[i][j]==0&&live==3){
                    board[i][j]=2;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]>0){
                    board[i][j]=1;
                }else{
                    board[i][j]=0;
                }
            }
        }
    }
}
