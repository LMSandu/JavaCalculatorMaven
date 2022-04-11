import com.endava.calculator.Basic.Basic;
import com.endava.calculator.Basic.BasicOperations;
import com.endava.extensions.TestReporterExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(TestReporterExtension.class)
public class CalculatorTest {

    private BasicOperations basicCalculator;


    @BeforeAll
    public static void setUpAllTests() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void tearDownAllTests() {
        System.out.println("After all");
    }

    public static List<Arguments> numberProvider() {
        List<Arguments> argumentsList = new ArrayList<>();
        argumentsList.add(Arguments.of(0, 2));
        argumentsList.add(Arguments.of(2, 0));

        return argumentsList;
    }

    @BeforeEach
    public void setUpEachTest() {
        basicCalculator = new Basic();
        System.out.println("Before Each");
    }

    @AfterEach
    public void tierDownEachTest() {
        System.out.println("After Each");
    }

    @Tags({@Tag("smoke"), @Tag("ui")})
    @ParameterizedTest
    @MethodSource("numberProvider")
    public void shouldAddNumbersGivenOperand0(int a, int b) {

        //GIVEN

        // WHEN
        long result = basicCalculator.add(a, b);

        //THEN
        System.out.println(result);
    }

    @Tag("smoke")
    @Test
    public void shouldAddNegativeNumbers() {
        //GIVEN

        // WHEN
        long result = basicCalculator.add(-2, -4);

        //THEN
        System.out.println(result);
    }

    @Tags({@Tag("smoke"), @Tag("api")})
    @Test
    public void shouldAddBigNumbers() {

        //GIVEN

        //WHEN
        long result = basicCalculator.add(Integer.MAX_VALUE, 1);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddMultipleOperands() {
        //GIVEN

        //WHEN
        long result = basicCalculator.add(2, 1, 2, 1);

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddNoOperands() {
        //GIVEN

        //WHEN
        long result = basicCalculator.add();

        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddOneOperand() {
        //GIVEN

        //WHEN
        long result = basicCalculator.add(1);

        //THEN
        System.out.println(result);
    }


}
