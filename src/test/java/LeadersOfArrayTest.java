import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LeadersOfArrayTest {

    @Test
    void findLeaders() {
        var L = new LeadersOfArray();
        int[] expectedOutput = {4, 0};
        int a[] = {1,2,3,4,0};
        int[] methodOutput = L.findLeaders(5, a);
        assertArrayEquals(expectedOutput, methodOutput);
    }

    @Test
    void findLeaders2() {
        var L = new LeadersOfArray();
        int[] expectedOutput = {17, 5, 2};
        int a[] = {16,17,4,3,5,2};
        int[] methodOutput = L.findLeaders(6, a);
        assertArrayEquals(expectedOutput, methodOutput);
    }

}