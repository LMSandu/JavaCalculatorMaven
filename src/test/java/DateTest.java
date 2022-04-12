import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static com.endava.matchers.InLastFiveMinutes.inLastFiveMinutes;
import static org.hamcrest.MatcherAssert.assertThat;

public class DateTest {

    @Test
    public void testDates(){
        LocalDateTime actual = LocalDateTime.now().minusMinutes(4);

        assertThat(actual, inLastFiveMinutes());
    }
}
