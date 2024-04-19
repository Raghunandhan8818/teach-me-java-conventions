import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import powerpackage.FindPower;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindPowerTest {

    @Test
    @DisplayName("Result should be 1 when any number is raised to 0")
    public void shouldGiveOneWhenAnyNumberIsRaisedToZero() {
        int result = FindPower.compute(2,0);
        assertEquals(1,result);
    }

    @Test
    @DisplayName("Result should be 2 when 2 is raised to 1")
    public void shouldGiveTwoWhenTwoIsRaisedToOne() {
        int result = FindPower.compute(2,1);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Result should be 4 when 2 is raised to 2")
    public void shouldGiveFourWhenTwoIsRaisedToTwo() {
        int result = FindPower.compute(2,2);
        assertEquals(4, result);
    }

    @Test
    @DisplayName("Result should be 9 when 3 is raised to 2")
    public void shouldGiveNineWhenThreeIsRaisedToTwo() {
        int result = FindPower.compute(3,2);
        assertEquals(9, result);
    }
}
