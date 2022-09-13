import com.example.Feline;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class FelineTest {

    @Test
    public void testMethodEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> felineEats = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), felineEats);
    }

    @Test
    public void testMethodGetFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testMethodGetKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(10, feline.getKittens(10));
    }

}
