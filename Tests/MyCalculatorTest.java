package calculator;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class MyCalculatorTest {
    @Test
    public void testAdd1(){
        MyCalculator Ex = new MyCalculator();
        long real = Ex.add(2,3);
        Assert.assertEquals(5,real);
    }
    @Test
    public void testAdd2(){
        MyCalculator Ex = new MyCalculator();
        long real = Ex.add(999999,999999);
        Assert.assertEquals(1999998,real);
    }
    @Test
    public void testAdd3(){
        MyCalculator Ex = new MyCalculator();
        long real = Ex.add(-3,-4);
        Assert.assertEquals(-7,real);
    }
    @Test
    public void testDivide1(){
        MyCalculator Ex = new MyCalculator();
        float real = Ex.divide(5,3);
        Assert.assertEquals((float) 5/3,real);
    }
    @Test
    public void testDivide2(){
        MyCalculator Ex = new MyCalculator();
        Assert.assertThrows(RuntimeException.class,() -> Ex.divide(4,0));
    }
    @Test
    public void testDivide3(){
        MyCalculator Ex = new MyCalculator();
        float real = Ex.divide(0,3);
        Assert.assertEquals((float) 0,real);
    }
    @Test
    public void testDivide4(){
        MyCalculator Ex = new MyCalculator();
        float real = Ex.divide(9998,5546);
        Assert.assertEquals((float) 9998/5546,real);
    }
}