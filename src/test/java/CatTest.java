import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void сatGetSoundShouldReturnCorrectSound() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу",cat.getSound());
    }


    @Test
    public void catGetFood() throws Exception {
        List<String> animals = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(animals);

        Cat cat = new Cat(feline);
        List<String> catsFood = cat.getFood();
        Assert.assertEquals(animals, catsFood);

    }

}
