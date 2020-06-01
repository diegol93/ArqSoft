import Game.TicTacToe;
import GameConsole.Console;
import GameConsole.ITicTacToe;

public class Main {

    public static void main(String[] args) {
        ITicTacToe tictactoe;
        //TicTacToe ticTacToe = new TicTacToe();
        tictactoe = new TicTacToe();
        Console c = new Console(tictactoe);
        c.run();
    }
/*
    public static void ganadorX(){
        TicTacToe t = new TicTacToe();
        Console c = new Console();
        t.markMove(0,0);
        t.changePlayer();
        t.markMove(0,2);
        t.changePlayer();
        t.markMove(1,1);
        t.changePlayer();
        t.markMove(0,1);
        t.changePlayer();
        t.markMove(2,2);
        t.changePlayer();

        if (t.checkTicTacToe()){
            t.showBoard();
            System.out.println("Ganador:" + t.winner());
            System.out.println("---------");

        }
    }

    public static void ganadorO(){
        TicTacToe t = new TicTacToe();
        Console c = new Console();
        t.markMove(0,0);
        t.changePlayer();
        t.markMove(0,2);
        t.changePlayer();
        t.markMove(1,1);
        t.changePlayer();
        t.markMove(2,2);
        t.changePlayer();
        t.markMove(1,0);
        t.changePlayer();
        t.markMove(1,2);
        t.changePlayer();

        if (t.checkTicTacToe()){
            t.showBoard();
            System.out.println("Ganador:" + t.winner());
            System.out.println("---------");

        }
    }

    public static void empate(){
        TicTacToe t = new TicTacToe();
        Console c = new Console();
        t.markMove(1,1);
        t.changePlayer();
        t.markMove(0,0);
        t.changePlayer();
        t.markMove(2,0);
        t.changePlayer();
        t.markMove(0,2);
        t.changePlayer();
        t.markMove(2,2);
        t.changePlayer();
        t.markMove(2,1);
        t.changePlayer();
        t.markMove(1,0);
        t.changePlayer();
        t.markMove(1,2);
        t.changePlayer();
        t.markMove(0,1);

        if (t.fullBoard() && t.draw()){
            t.showBoard();
            System.out.println("Empate");
            System.out.println("---------");

        }
    }
*/

}








