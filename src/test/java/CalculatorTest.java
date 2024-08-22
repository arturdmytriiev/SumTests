import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    public void beforeEach()
    {
        sumCalculator = new SumCalculator();
    }
    @Test
    void testSumRetrunOne()
    {
        //When
        int actual = sumCalculator.sum(1);
        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testSumReturnSix() {
        //When
        int actual = sumCalculator.sum(3);
        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testSumThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->sumCalculator.sum(0));
    }
}
