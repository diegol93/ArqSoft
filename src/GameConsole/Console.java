package GameConsole;
import Game.TicTacToe;

import java.util.Scanner;

public class Console {

    private TicTacToe t; 
    private ITicTacToe game;

    public Console (ITicTacToe game){
        this.game = game;
    }

    public Console(){

    }
    public void run(){

        mainMenu();
        selectOption();
        Scanner teclado = new Scanner(System.in);

        int option = teclado.nextInt();

        if (optionNumber(1, 2, option) && option == 1) {
            game.create();
            drawBoard();
            do {
                selectOptionTwo();
                int row;
                int column;

                do {
                    System.out.println("Ingrese Fila");
                    row = teclado.nextInt();
                    System.out.println("Ingrese Columna");
                    column = teclado.nextInt();

                    if(row == 4 && column==4){
                        game.create();

                    } else{
                        if (row == 5 && column==5){
                            System.exit(0);
                        }
                    }

                } while (!game.markMove(row, column));

                drawBoard();
               // t.changePlayer();
            } while (!game.checkTicTacToe() && !game.draw());
            if (game.checkTicTacToe()) {
                System.out.println("---------");
                drawBoard();
                System.out.println("GANASTE JUGADOR:" + game.winner());
            }
             else {
                if (game.draw()) {
                    System.out.println("---------");
                    drawBoard();
                    System.out.println("Empate");
                }
            }
        }
        else {
            if (optionNumber(1, 2, option) && option == 2) {
                System.out.println("Adios");
                System.exit(0);
            } else {
                run();
            }
        }
    }

    public void selectOption(){
        System.out.println("|1. Empezar Nueva Partida        |");
        System.out.println("|2. Salir                        |");
        System.out.println("|________________________________|");
    }

    public void selectOptionTwo(){
        System.out.println("---------");
        System.out.println("4. Volver a Jugar ");
        System.out.println("5. Salir del Juego");
        System.out.println("---------");
    }

    public void mainMenu(){
        System.out.println("__________________________________");
        System.out.println("|Bienvenido al Juego Tres En Raya|");
        System.out.println("|Seleccione una Opcion:          |");
    }

    public boolean optionNumber(int init, int exit, int option ){
        boolean res= false;
        if(init  >= 0 && init <=2 && exit >=0 && exit<=2) {
            if(option >= init && option <= exit){
                res = true;
            }
            res = true;
        }
        return res;
    }

    public void drawBoard() {
        char [][] board = game.getBoard();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
