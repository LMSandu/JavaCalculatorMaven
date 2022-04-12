import com.endava.calculator.Basic.Basic;
import com.endava.calculator.Basic.BasicOperations;
import com.endava.calculator.Expert.Expert;
import com.endava.calculator.Expert.ExpertOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorIT {

    private BasicOperations basicCalculator;
    private ExpertOperations expertCalculator;

    @BeforeEach
    public void setUpEachTest() {
        basicCalculator = new Basic();
        expertCalculator = new Expert();
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyNegativeNumbers() {

        // WHEN
        long result = basicCalculator.multiply(-1, -4);

        //THEN
        assertThat(result, equalTo(4L));
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyOperand1() {

        // WHEN
        long result = basicCalculator.multiply(1, -4);

        //THEN
        assertThat(result).isEqualTo(-4L).isNegative();
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyPositiveOperands() {

        // WHEN
        long result = basicCalculator.multiply(3, 4);

        //THEN
        assertThat(result).isEqualTo(12L).isNotNull();
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyNoOperands() {

        // WHEN
        long result = basicCalculator.multiply();

        //THEN
        assertThat(result).isEqualTo(1);
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyGivenOneOperand() {

        // WHEN
        long result = basicCalculator.multiply(2);

        //THEN
        assertThat(result, equalTo(2L));
    }

    @Tag("pow")
    @Test
    public void shouldPowGivenPositiveOperands() {

        // WHEN
        double result = expertCalculator.pow(2, 2);

        //THEN
        assertThat(result, equalTo(4D));
    }

    @Tag("pow")
    @Test
    public void shouldPowGivenNegativeOperand() {

        // WHEN
        double result = expertCalculator.pow(-2, 2);

        //THEN
        assertThat(result).isNotNegative();
    }

    @Tag("pow")
    @Test
    public void shouldPowGivenOperand1() {

        // WHEN
        double result = expertCalculator.pow(2, 1);

        //THEN
        assertThat(result, equalTo(2D));
    }

    @Tag("pow")
    @Test
    public void shouldPowGivenOperand0() {

        // WHEN
        double result = expertCalculator.pow(2, 0);

        //THEN
        assertThat(result, equalTo(1D));
    }

    @Tag("fact")
    @Test
    public void shouldFactGivenOperand1() {

        // WHEN
        double result = expertCalculator.factRec(1);

        //THEN
        assertThat(result, equalTo(1D));
    }

    @Tag("fact")
    @Test
    public void shouldFactGivenPositiveNumber() {

        // WHEN
        double result = expertCalculator.factRec(6);

        //THEN
        assertThat(result).isEqualTo(720D);
    }
}
