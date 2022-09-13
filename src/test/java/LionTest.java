import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;


public class LionTest {
    private final String defaultSex = "Самец";

    @Test
    public void doesHaveManeMaleReturnTrue() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        Assert.assertTrue("У льва должна быть грива",
                new Lion("Самец", feline).doesHaveMane());
    }

    @Test
    public void doesHaveManeFemaleReturnFalse() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Assert.assertFalse(
                "У львицы не должна быть грива",
                new Lion("Самка", feline).doesHaveMane());
    }

    @Test
    public void getKittensReturnCorrectInt() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(1);

        Lion lion = new Lion(defaultSex, feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionGetFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood(anyString())).thenReturn(expectedFood);
        Lion lion = new Lion(defaultSex, feline);
        Assert.assertEquals(expectedFood, lion.getFood());
    }
}