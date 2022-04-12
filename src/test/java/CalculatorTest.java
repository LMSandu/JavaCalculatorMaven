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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

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
    }

    @Tags({@Tag("smoke"), @Tag("ui")})
    @ParameterizedTest
    @MethodSource("numberProvider")
    public void shouldAddNumbersGivenOperand0(int a, int b) {

        //GIVEN

        // WHEN
        long result = basicCalculator.add(a, b);

        //THEN
        assertThat(result).isEqualTo(a+b);
    }

    @Tag("smoke")
    @Test
    public void shouldAddNegativeNumbers() {
        //GIVEN

        // WHEN
        Long result = basicCalculator.add(-2, -4);

        //THEN
        assertEquals(-6L, result);
        assertTrue(result.equals(-6L));

    }

    @Tags({@Tag("smoke"), @Tag("api")})
    @Test
    public void shouldAddBigNumbers() {

        //GIVEN

        //WHEN
        long result = basicCalculator.add(Integer.MAX_VALUE, 1);

        //THEN
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAddMultipleOperands() {
        //GIVEN

        //WHEN
        long result = basicCalculator.add(2, 1, 2, 1);

        //THEN
        assertThat(result, equalTo(6L));
    }

    @Test
    public void shouldAddNoOperands() {
        //GIVEN

        //WHEN
        long result = basicCalculator.add();

        //THEN
        assertThat(result, equalTo(0L));
    }

    @Test
    public void shouldAddOneOperand() {
        //GIVEN

        //WHEN
        long result = basicCalculator.add(1);

        //THEN
        assertThat(result, lessThan(2L));
    }


}
