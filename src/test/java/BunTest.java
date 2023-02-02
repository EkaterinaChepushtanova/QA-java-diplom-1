import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

    @Test
    public void bunGetNameTest(){
        Bun bun = new Bun("Краторная булка N-200i", 1255);
        Assert.assertEquals("Краторная булка N-200i", bun.getName());
    }

    @Test
    public void bunGetPriceTest(){
        Bun bun = new Bun("Краторная булка N-200i", 1255);
        Assert.assertEquals(1255, bun.getPrice(), 0);
    }
}
