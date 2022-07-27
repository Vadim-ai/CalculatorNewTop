package pro.sky.CalculatorNewTop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceImplTests {

    private int num0 = 0;
    private int num1 = 1;
    private int num2 = 2;
    private int num3 = 3;
    private int num4 = 4;

    @Test
    public void checkMtdPlus() { ServiceImpl service = new ServiceImpl();
    int expected = service.plus(num1, num2);
    int actual = num1 + num2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkAgainMtdPlus() { ServiceImpl service = new ServiceImpl();
        int expected = service.plus(num3, num4);
        int actual = num3 + num4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMtdMinus() { ServiceImpl service = new ServiceImpl();
        int expected = service.minus(num2, num1);
        int actual = num2 - num1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkAgainMtdMinus() { ServiceImpl service = new ServiceImpl();
        int expected = service.minus(num4, num3);
        int actual = num4 - num3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMtdMultiply() { ServiceImpl service = new ServiceImpl();
        int expected = service.multiply(num1, num2);
        int actual = num1 * num2;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkAgainMtdMultiply() { ServiceImpl service = new ServiceImpl();
        int expected = service.multiply(num3, num4);
        int actual = num3 * num4;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkMtdDivide() { ServiceImpl service = new ServiceImpl();
        int expected = service.divide(num1, num2);
        int actual = num1 / num2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkAgainMtdDivide() { ServiceImpl service = new ServiceImpl();
        int expected = service.divide(num3, num4);
        int actual = num3 / num4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMtdDivideOnZero() { ServiceImpl service = new ServiceImpl();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> service.divide(num1, num0));
    }


}
