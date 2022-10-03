import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxToysTest {

    @Test
    void findMaxToys() {
        var L = new MaxToys();
        int expectedOutput = 4;
        int k = 50;
        int a[] = {1, 12, 5, 111, 200, 1000, 10};
        int methodOutput = L.findMaxToys(a, k);
        assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void findMaxToys2() {
        var L = new MaxToys();
        int expectedOutput = 3;
        int k = 100;
        int a[] = {20, 30, 50};
        int methodOutput = L.findMaxToys(a, k);
        assertEquals(expectedOutput, methodOutput);
    }

}