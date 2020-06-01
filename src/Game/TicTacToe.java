package Game;

import GameConsole.ITicTacToe;

public class TicTacToe implements ITicTacToe {

    private char board [][] = new char[3][3];
    private boolean validCell;
    private char simbolPlayer='X';
    private char J1 = 'X';
    private char J2 = 'O';


    public TicTacToe(){
        create();
    }

    @Override
    public void create() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '_' ;
            }
        }
    }

    @Override
    public boolean markMove(int row, int column) {
        if (validatePosition(row,column) ){
            if (board[row][column] == '_') {
                board[row][column] = simbolPlayer;
                changePlayer();
                return true;
            } else {
                if (board[row][column] == simbolPlayer) {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean checkTicTacToe() {
        return coincidenceRow() ||
                coincidenceColumn() ||
                coincidenceDiagonal() ||
                coincidenceDiagonalInverse();
    }

    @Override
    public char winner() {
        char winner = ' ';
        if (checkTicTacToe()) {
            changePlayer();
            winner = getSimbolPlayer();
        }
        return winner;
    }

    @Override
    public boolean draw() {
        boolean empate=false;
        if(!checkTicTacToe() && fullBoard() ){
            empate = true;
        }
        return empate;
    }

    @Override
    public char[][] getBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                board[row][column] = getCell(row, column);
            }
        }
        return board;
    }


    /*
    public void showBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println("");
        }
    }*/

    public boolean validatePosition(int row, int column){
        if (row >= 0 && row < board.length && column >= 0 && column < board.length) {
            return true;
        }
        return false;
    }


    public boolean fullBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    public  boolean validCell(int row, int column) {
        if (board[row][column] != '_') {
            validCell = true;
        }else{
            if (board[row][column] != 'X' || board[row][column] != 'O'){
                validCell = false;
            }
        }
        return validCell;
    }

    public char changePlayer(){
        if(simbolPlayer == J1 ){
            simbolPlayer = J2;
        }else{
            simbolPlayer = J1;
        }
        return  simbolPlayer;
    }

    public char getSimbolPlayer(){
        return simbolPlayer;
    }

    public boolean coincidenceRow(){
        char symbol;
        boolean coincidence;

        for (int i = 0; i < board.length; i++) {
            coincidence = true;
            symbol = board[i][0];
            if (symbol != '_') {
                for (int j = 1; j < board[0].length; j++) {
                    if (symbol != board[i][j]) {
                        coincidence = false;
                    }
                }
                if (coincidence) {
                    validCell = true;
                    return validCell;
                }
            }
        }
        validCell = false;
        return validCell;
    }

    public boolean coincidenceColumn(){
        char symbol;
        boolean coincidence;

        for (int j = 0; j < board.length; j++) {
            coincidence = true;
            symbol = board[0][j];
            if (symbol != '_') {
                for (int i = 1; i < board[0].length; i++) {
                    if (symbol != board[i][j]) {
                        coincidence = false;
                    }
                }
                if (coincidence) {
                    validCell = true;
                    return validCell;
                }
            }
        }
        validCell = false;
        return validCell;
    }

    public boolean coincidenceDiagonal(){
        char symbol;
        boolean coincidence = true;

        symbol = board[0][0];
        if (symbol != '_') {
            for (int i = 1; i < board.length; i++) {
                if (symbol != board[i][i]) {
                    coincidence = false;
                }
            }if (coincidence) {
                validCell = true;
                return validCell;
            }
        }
        validCell = false;
        return validCell;
    }

    public boolean coincidenceDiagonalInverse(){
        char symbol;
        boolean coincidence = true;
        symbol = board[0][2];
        if (symbol != '_') {
            for (int i = 1, j = 1; i < board.length; i++, j--) {
                if (symbol != board[i][j]) {
                    coincidence = false;
                }
            }
            if (coincidence){
                validCell = true;
                return validCell;

            }
        }
        validCell = false;
        return validCell;
    }

    private char getCell(int row, int column) {
        return board[row][column];
    }
    /*
    public void playAgain(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '_' ;
            }
        }
    }*/


}
