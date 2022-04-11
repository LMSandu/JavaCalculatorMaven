import com.endava.calculator.Basic.Basic;
import com.endava.calculator.Basic.BasicOperations;
import com.endava.calculator.Expert.Expert;
import com.endava.calculator.Expert.ExpertOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorIT implements LauncherSessionListener  {

    private BasicOperations basicCalculator;
    private ExpertOperations expertCalculator;

    @BeforeEach
    public void setUpEachTest() {
        basicCalculator = new Basic();
        expertCalculator = new Expert();
        System.out.println("Before Each");
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyNegativeNumbers() {

        // WHEN
        long result = basicCalculator.multiply(-1, -4);

        //THEN
        System.out.println(result);
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyOperand1() {

        // WHEN
        long result = basicCalculator.multiply(1, -4);

        //THEN
        System.out.println(result);
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyPositiveOperands() {

        // WHEN
        long result = basicCalculator.multiply(3, 4);

        //THEN
        System.out.println(result);
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyNoOperands() {

        // WHEN
        long result = basicCalculator.multiply();

        //THEN
        System.out.println(result);
    }

    @Tag("multiply")
    @Test
    public void shouldMultiplyGivenOneOperand() {

        // WHEN
        long result = basicCalculator.multiply(2);

        //THEN
        System.out.println(result);
    }

    @Tag("pow")
    @Test
    public void shouldPowGivenPositiveOperands() {

        // WHEN
        double result = expertCalculator.pow(2, 2);

        //THEN
        System.out.println(result);
    }

    @Tag("pow")
    @Test
    public void shouldPowGivenNegativeOperand() {

        // WHEN
        double result = expertCalculator.pow(-2, 2);

        //THEN
        System.out.println(result);
    }

    @Tag("pow")
    @Test
    public void shouldPowGivenOperand1() {

        // WHEN
        double result = expertCalculator.pow(2, 1);

        //THEN
        System.out.println(result);
    }

    @Tag("pow")
    @Test
    public void shouldPowGivenOperand0() {

        // WHEN
        double result = expertCalculator.pow(2, 0);

        //THEN
        System.out.println(result);
    }

    @Tag("fact")
    @Test
    public void shouldFactGivenOperand1() {

        // WHEN
        double result = expertCalculator.factRec(1);

        //THEN
        System.out.println(result);
    }

    @Tag("fact")
    @Test
    public void shouldFactGivenPositiveNumber() {

        // WHEN
        double result = expertCalculator.factRec(6);

        //THEN
        System.out.println(result);
    }
}
