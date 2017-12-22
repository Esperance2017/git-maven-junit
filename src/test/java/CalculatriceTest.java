import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatriceTest {

    @Test
    public void addition() {
        Assert.assertEquals(Calculatrice.addition(1 , 2), 3);
    }

    @Test
    public void soustraction() {
        Assert.assertEquals(Calculatrice.soustraction(4, 2), 2);
    }

    @Test
    public void multiplication() {
        Assert.assertEquals(Calculatrice.multiplication(2, 2), 4);
    }

    @Test
    public void division() {
        Assert.assertEquals(Calculatrice.division(5, 2), 2);
    }
}