package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;



public class Calculator_Tests {

    private static Calculator calc;

    @BeforeClass
    public static void Setup(){
        calc = new Calculator();
        System.out.println("SETUP");
    }

    @Category({ArithmeticTests.class, PositiveTests.class})
    @Test
    public void AdditionTest(){
        Assert.assertEquals(4, calc.sum(2,2));
    }

    @Category({ArithmeticTests.class, PositiveTests.class})
    @Test
    public void SubtractionTest(){
        Assert.assertEquals(0, calc.sub(2,2));
        Assert.assertEquals(2, calc.sub(0,-2));
        Assert.assertEquals(-3.1, calc.sub(-5.5,-2.4),0.0);
    }

    @Category({ArithmeticTests.class, PositiveTests.class})
    @Test
    public void MultiplicationTest(){
        Assert.assertEquals(4, calc.mult(2,2),0.0);
        Assert.assertEquals(4, calc.mult(2.,2),0.0);
        Assert.assertEquals(10, calc.mult(-5.,-2),0.0);
    }

    @Category({ArithmeticTests.class, PositiveTests.class})
    @Test
    public void DivideTest(){
        Assert.assertEquals(4, calc.div(8,2));
    }

    @Category({ArithmeticTests.class, PositiveTests.class})
    @Test (expected = NumberFormatException.class)
    public void DivideByZero(){
        Assert.assertEquals(0, calc.div(2,0));
    }

    @Category({PositiveTests.class})
    @Test
    public void IsPositiveIsNegativeTest(){
        Assert.assertTrue(calc.isNegative(-5));
        Assert.assertFalse(calc.isPositive(-5));

        Assert.assertTrue(calc.isNegative(-555555778));
        Assert.assertFalse(calc.isPositive(-555555778));

        Assert.assertFalse(calc.isNegative(5));
        Assert.assertTrue(calc.isPositive(5));

        Assert.assertFalse(calc.isNegative(0));
        Assert.assertFalse(calc.isPositive(0));
    }

    @Category({PositiveTests.class})
    @Test
    public void PowerFunctionTest(){
        Assert.assertEquals(0.25,calc.pow(-2,-2),0.0);
    }

    @Category({PositiveTests.class})
    @Test
    public void SinThetaTest(){
        Assert.assertEquals(Math.sin(-2.5),calc.sin(-2.5),0.0);
    }

    @Category({NegativeTests.class})
    @Test
    public void CosThetaTest(){
        Assert.assertEquals(Math.cos(2),calc.cos(2),0.0);
    }

    @Category({NegativeTests.class})
    @Test
    public void TanThetaTest(){
        Assert.assertEquals(Math.tan(2),calc.tg(2),0.0);
    }

    @Category({NegativeTests.class})
    @Test
    public void CotThetaTest(){
        Assert.assertEquals(1/Math.tan(2),calc.ctg(2),0.0);
    }

    @Category({ArithmeticTests.class,NegativeTests.class})
    @Test
    public void NegativeMultiplicationTest(){
        Assert.assertEquals (13.2, calc.mult(-5.5,-2.4),0.0);
    }

    @Category({NegativeTests.class})
    @Test
    public void NegativePowerTest(){
        Assert.assertEquals(Double.NaN,calc.pow(-5,-2.4),0.0);
    }

    @AfterClass
    public static void TearDown(){
        System.out.println("The End");
    }

    public interface PositiveTests {
    }

    public interface NegativeTests {
    }

    public interface ArithmeticTests {
    }
}


