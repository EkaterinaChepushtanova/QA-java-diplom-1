import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(MockitoJUnitRunner.class)

public class BurgerTest {

    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    @Mock
    Ingredient ingredient2;

    Burger burger = new Burger();

    @Test
    public void setBunsTest(){
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.bun);
    }

    @Test
    public void addIngredientTest(){
        burger.addIngredient(ingredient);
        Assert.assertEquals(1, burger.ingredients.size());
    }

    @Test
    public void removeIngredientTest(){
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertTrue(burger.ingredients.isEmpty());
    }

    @Test
    public void moveIngredientTest(){
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient2);
        burger.moveIngredient(0, 1);
        Assert.assertEquals(ingredient2, burger.ingredients.get(0));
    }

    @Test
    public void burgerGetPriceTest(){
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getPrice()).thenReturn(100f);
        Mockito.when(ingredient.getPrice()).thenReturn(250f);
        Assert.assertEquals(450.0, burger.getPrice(), 0);
    }

    @Test
    public void burgerGetReceiptTest(){
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getName()).thenReturn("Краторная булка N-200i");
        Mockito.when(bun.getPrice()).thenReturn(1255f);
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(ingredient.getName()).thenReturn("Хрустящие минеральные кольца");
        Mockito.when(ingredient.getPrice()).thenReturn(300f);
        Assert.assertEquals(String.format("(==== Краторная булка N-200i ====)%n" +
                "= filling Хрустящие минеральные кольца =%n" +
                "(==== Краторная булка N-200i ====)%n" +
                "%nPrice: 2810,000000%n"), burger.getReceipt());
    }

}
