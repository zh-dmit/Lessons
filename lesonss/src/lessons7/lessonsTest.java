package lessons7;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class lessonsTest {
    @Test
    public void TestWenFoundMinValueArrayOfMin(){
        int [] testarr = {44,12,81,98,18};
        int expected = 1;
        int result = lessons.min(testarr);
        assertThat(result, is(expected));


    }
    @Test
    public void AverageValueArrayOfArithmetic(){
        int [] testarr = {44,12,81,98,18};
        double expected = 50.6;
        double result = lessons.arithmetic(testarr);
        assertThat(result, is(expected));


    }




}