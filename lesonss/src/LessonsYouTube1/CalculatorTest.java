package LessonsYouTube1;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public  void WenReturnAddOfTwoArguments() {
        double arg1 = 5;
        double arg2 = 8;
        double expected = 13;
        double result = calc.add(arg1,arg2);
        assertThat(result, is(expected));

    }
    @Test
    public void ReturnSubtractOfTwoArguments(){
        double arg1 = 5;
        double arg2 = 8;
        double expected = -3;
        double result = calc.subtract(arg1,arg2);
        assertThat(result, is(expected));

    }
    @Test
    public void ReturnShareOfTwoArguments(){
        double arg1 = 12;
        double arg2 = 6;
        double expected = 2;
        double result = calc.share(arg1,arg2);
        assertThat(result, is(expected));
    }
    @Test
    public void ReturnMultiplyOfTwoArguments (){
        double arg1 = 2;
        double arg2 = 7;
        double expected = 14;
        double result = calc.multiply(arg1,arg2);
        assertThat(result, is(expected));
    }
    @Test
    public void ReturnSqrOfTwoArguments (){
        double arg1 = 3;
        double arg2 = 2;
        double expected = 9;
        double result = calc.sqr(arg1,arg2);
        assertThat(result,is(expected));
    }





}