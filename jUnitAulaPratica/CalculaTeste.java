
import org.junit.*;
import org.junit.Test;
import aplicacao.Calcula;

public class CalculaTeste {

    @Test
    public void testeSoma() {

        Calcula calc = new Calcula();
        Assert.assertEquals(15,calc.soma(10, 5),0);
        Assert.assertEquals(8,calc.soma(10, -2),0);
        Assert.assertEquals(30,calc.soma(-5, 35),0);
        Assert.assertEquals(-40,calc.soma(-5, -35),0);
    }

    @Test
    public void testeSubtrai() {

        Calcula calc1 = new Calcula();
        Assert.assertEquals(5,calc1.subtrai(10,5),0);
        Assert.assertEquals(18,calc1.subtrai(13,-5),0);
        Assert.assertEquals(-6,calc1.subtrai(-1,5),0);
        Assert.assertEquals(-5,calc1.subtrai(-10,-5),0);
    }

    @Test
    public void testeMultiplica() {

        Calcula calc2 = new Calcula();
        Assert.assertEquals(4,calc2.multiplica(2,2),0);
        Assert.assertEquals(-8,calc2.multiplica(4,-2),0);
        Assert.assertEquals(-30,calc2.multiplica(-3,10),0);
        Assert.assertEquals(50,calc2.multiplica(-10,-5),0);
    }

    @Test
    public void testeDivide() {

        Calcula calc3 = new Calcula();
        Assert.assertEquals(1,calc3.divide(2,2),0);
        Assert.assertEquals(-2,calc3.divide(4,-2),0);
        Assert.assertEquals(-5,calc3.divide(-10,2),0);
        Assert.assertEquals(10,calc3.divide(-20,-2),0);
    }


}