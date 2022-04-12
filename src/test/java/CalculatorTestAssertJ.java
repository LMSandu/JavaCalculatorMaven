import com.endava.calculator.Basic.Basic;
import com.endava.calculator.Basic.BasicOperations;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTestAssertJ {

    private BasicOperations basicCalculator = new Basic();

    @Test
    public void shouldAddOperand(){
        //WHEN
        Long result = basicCalculator.add(156L);

        //THEN
        assertThat(result).isEqualTo(167L)
                .isBetween(100L,200L)
                .isNotNegative()
                .isNotNull();
    }
}
