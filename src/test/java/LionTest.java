import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class LionTest {
    private final String defaultSex = "Самец";

  Feline feline;

    @Test
    public void doesHaveManeMaleReturnTrue() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        boolean expectedValue = true;
        Assert.assertEquals(expectedValue, lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFemaleReturnFalse() throws Exception {
        String sex = "Самка";
        Lion lion = new Lion(sex, feline);
        boolean expectedValue = false;
        boolean actualValue = lion.doesHaveMane();
        Assert.assertEquals(expectedValue, lion.doesHaveMane());
    }

    @Test
    public void getKittensReturnCorrectInt() throws Exception {
        Lion lion = new Lion(defaultSex, feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionGetFood() throws Exception {
        Lion lion = new Lion(defaultSex, feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, lion.getFood());
    }
}