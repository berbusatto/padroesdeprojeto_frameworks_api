import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void soma() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(15,calc.soma(10, 5),0);
        Assert.assertEquals(8,calc.soma(10, -2),0);
        Assert.assertEquals(30,calc.soma(-5, 35),0);
        Assert.assertEquals(-40,calc.soma(-5, -35),0);
    }

    @Test
    void subtrai() {
        Calculadora calc1 = new Calculadora();
        Assert.assertEquals(5,calc1.subtrai(10,5),0);
        Assert.assertEquals(18,calc1.subtrai(13,-5),0);
        Assert.assertEquals(-6,calc1.subtrai(-1,5),0);
        Assert.assertEquals(-5,calc1.subtrai(-10,-5),0);
    }

    @Test
    void multiplica() {
        Calculadora calc2 = new Calculadora();
        Assert.assertEquals(4,calc2.multiplica(2,2),0);
        Assert.assertEquals(-8,calc2.multiplica(4,-2),0);
        Assert.assertEquals(-30,calc2.multiplica(-3,10),0);
        Assert.assertEquals(50,calc2.multiplica(-10,-5),0);
    }

    @Test
    void divide() {
        Calculadora calc3 = new Calculadora();
        Assert.assertEquals(1,calc3.divide(2,2),0);
        Assert.assertEquals(-2,calc3.divide(4,-2),0);
        Assert.assertEquals(-5,calc3.divide(-10,2),0);
        Assert.assertEquals(10,calc3.divide(-20,-2),0);
    }
}