import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
private Calculator calculator;





 @Test
public void add_TwoPlusTwo_ReturnsFour(){
      int expected = 4;
      int actual = calculator.add(2, 2);
     assertEquals(actual, expected);
 }

 @Test
    public void subtract_TenMinusFive_ReturnsFive(){
      int expected = 5;
      int actual = calculator.subtract(10, 5);
     assertEquals(actual, expected);
 }

 @Test
    public void multiply_FiveMultiplyFive_ReturnsTwentyFive(){
     int expected = 25;
     int actual = calculator.multiply(5, 5);
     assertEquals(actual, expected);
 }

 @Test
    public void divide_TenDividedByFive_ReturnsTwo(){
      double expected = 2.0;
      double actual = calculator.divide(10, 5);
     assertEquals(actual, expected, 0.001);
 }

}

