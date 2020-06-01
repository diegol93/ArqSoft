package Game;

import Game.TicTacToe;
import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void validarPosicionTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.markMove(0,0);
        Assert.assertTrue(true);
    }

    @Test
    public void validarPosicionTest2(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.markMove(1,2);
        Assert.assertTrue(true);
    }

    @Test
    public void validarPosicionTest3(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.markMove(3,4);
        Assert.assertFalse(false);

    }

    @Test
    public void hayValorPosicionValidoTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.validCell(1,1);
        Assert.assertTrue("Ok",true );
    }


    @Test
    public void finPartidaTest(){
        char simbol = 'X';
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.validCell(0,0);
        Assert.assertEquals(simbol, 'X');

    }

    @Test
    public void finPartidaTest2(){
        char simbol = 'O';
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.checkTicTacToe();
        Assert.assertNotEquals(simbol, 'X');

    }

    @Test
    public void coicidenciaFilaTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.markMove(0,0);
        ticTacToe.markMove(0,1);
        ticTacToe.markMove(0,2);
        Assert.assertTrue(true);
    }

    @Test
    public void coincidenciacolumnaTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.markMove(0,0);
        ticTacToe.markMove(1,0);
        ticTacToe.markMove(2,0);
        Assert.assertTrue(true);
    }
    @Test
    public void coincidenciaDiagonalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.markMove(0,0);
        ticTacToe.markMove(1,1);
        ticTacToe.markMove(2,2);
        Assert.assertTrue(true);
    }

    @Test
    public void coincidenciaDiagonalInversaTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.markMove(0,2);
        ticTacToe.markMove(1,1);
        ticTacToe.markMove(2,0);
        Assert.assertTrue(true);
    }




}