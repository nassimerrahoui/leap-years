package app;

import com.ippon.kata.Year;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YearTest {
    @Test
    public void isLeapYearFor2000() {
        Assertions.assertTrue(new Year(2000).isLeap());
    }

    @Test
    public void isNotLeapYearFor1700() {
        Assertions.assertFalse(new Year(1700).isLeap());
    }

    @Test
    public void isLeapYearFor2008() {
        Assertions.assertTrue(new Year(2008).isLeap());
    }

    @Test
    public void isNotLeapYearFor2017() {
        Assertions.assertFalse(new Year(2017).isLeap());
    }
}
