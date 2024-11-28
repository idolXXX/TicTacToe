package com.example.tictactoe;

public class XO{
    private int [] [] board;
    private int count;
    public XO() {
        this.board=new int [3][3];
        this.count=1;
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                this.board[i][j]=-1;
            }

        }
    }
    public boolean isWin () {
        for (int i=0;i<3;i++) {
            if (this.board[i][0]==this.board[i][1]&& this.board[i][0]==this.board[i][2]&&this.board[i][0]!=-1) {
                return true;
            }
            if (this.board[0][i]==this.board[1][i]&& this.board[0][i]==this.board[2][i]&&this.board[0][i]!=-1){
                return true;
            }

        }
        if ( this.board[0][0]==this.board[1][1]&& this.board[0][0]==this.board[2][2]&&this.board[0][0]!=-1){
            return true;
        }
        if (this.board[0][2]==this.board[1][1]&& this.board[0][2]==this.board[2][0]&&this.board[0][2]!=-1){
            return true;
        }
        return false;

    }
    public int[][] getBoard() {
        return this.board;
    }
    public int getCount() {
        return this.count;
    }

    public void setBoard(int a,int i,int j) {
       this.board[i][j]=a;
    }

    public void setCount(int count) {
        this.count=count;
    }

}
