import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by dell on 07.09.2017.
 */
public class SquareTests {

    @Test
    public void testArea(){
        Square s = new Square(5);
        Assert.assertEquals(s.square() , 25.0);
    }
}
