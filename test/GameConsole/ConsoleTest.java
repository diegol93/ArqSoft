package GameConsole;

import GameConsole.Console;
import org.junit.Assert;
import org.junit.Test;

public class ConsoleTest {

    @Test
    public void numeroOpcionJugarTest(){

        Console c = new Console();
        c.optionNumber(1,2,1);
        Assert.assertTrue(true);

    }

    @Test
    public void numeroOpcionSalir(){
        Console c = new Console();
        c.optionNumber(1,2,2);
        Assert.assertTrue(true);
    }

    @Test
    public void numeroOpcionError(){
        Console c = new Console();
        c.optionNumber(1,2,4);
        Assert.assertFalse(false);

    }
}