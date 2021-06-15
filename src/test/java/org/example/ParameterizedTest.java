package org.example;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private static Calculator calc;

    @Parameterized.Parameters(name="Parametrized")
    public static Object[][] EndPointData(){
        return new Object[][] {
                {5,4,9},
                {1,3,4},
                {9,7,16},
                {1,0,1},
        };
    }

    @BeforeClass
    public static void Setup(){
        calc = new Calculator();
    }

    @Parameterized.Parameter(value = 0)
    public int a;
    @Parameterized.Parameter(value = 1)
    public int b;
    @Parameterized.Parameter(value = 2)
    public int c;

    @Test
    public  void DatProviderAdditionTest(){
        System.out.println("Parameterized Test");
        Assert.assertEquals(c, calc.sum(a,b));
    }
}
