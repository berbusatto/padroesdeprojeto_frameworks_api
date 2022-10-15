import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {

    @Test
    void soma() {
        int[] valores = {1,5,10,30};
        Assert.assertEquals(46, ArrayUtil.soma(valores));
    }

    @Test
    void menor() {
        int[] valores = {91,5,123,19};
        Assert.assertEquals(5, ArrayUtil.menor(valores));
    }

    @Test
    void maior() {
        int[] valores = {91,5,123,19};
        Assert.assertEquals(123, ArrayUtil.maior(valores));
    }


    @Test
    void negativo() {
        int[] valoresA = {91,5,123,19};
        Assert.assertEquals(0,ArrayUtil.negativo(valoresA));

        int[] valoresB = {10, -5, 35, 42, 54};
        Assert.assertEquals(1,ArrayUtil.negativo(valoresB));

        int[] valoresC = {1,4,-78,90,-89, 99};
        Assert.assertEquals(2,ArrayUtil.negativo(valoresC));

        int[] valoresD = {-2, -7, -10, -20, -40};
        Assert.assertEquals(5,ArrayUtil.negativo(valoresD));


    }


    @Test
    void par() {
        int[] valoresA = {2, 4, 6, 8};
        assertTrue(ArrayUtil.par(valoresA));

        int[] valoresB = {10, 15, 20, 42, 54};
        assertFalse(ArrayUtil.par(valoresB));

        int[] valoresC = {1,3,5};
        assertFalse(ArrayUtil.par(valoresC));
    }
}