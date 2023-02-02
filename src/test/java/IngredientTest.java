import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import praktikum.Bun;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;

public class IngredientTest {

    @Test
    public void ingredientGetPriceTest(){
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Хрустящие минеральные кольца", 300);
        Assert.assertEquals(300, ingredient.getPrice(), 0);
    }

    @Test
    public void ingredientGetNameTest(){
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Хрустящие минеральные кольца", 300);
        Assert.assertEquals("Хрустящие минеральные кольца", ingredient.getName());
    }

    @Test
    public void ingredientGetTypeTest(){
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Хрустящие минеральные кольца", 300);
        Assert.assertEquals(IngredientType.FILLING, ingredient.getType());
    }
}
