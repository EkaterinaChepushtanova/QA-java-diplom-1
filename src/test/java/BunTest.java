import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)

public class BunTest {
    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "name: {0}, price: {1}")
    public static Object[][] getBun() {
        return new Object[][]{
                {"Краторная булка N-200i", 1255},
                {"Флюоресцентная булка R2-D3", 988}
        };
    }

    @Test
    public void bunTest() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
        Assert.assertEquals(price, bun.getPrice(), 0);
    }
}