import static org.junit.jupiter.api.Assertions.*;

class MinSwapsTest {

    @org.junit.jupiter.api.Test
    void findMinSwaps() {
        var L = new MinSwaps();
        int expectedOutput = 1;
        int a[] = {2, 8, 5, 4};
        int methodOutput = L.findMinSwaps(a);
        assertEquals(expectedOutput, methodOutput);
    }

    @org.junit.jupiter.api.Test
    void findMinSwaps2() {
        var L = new MinSwaps();
        int expectedOutput = 2;
        int a[] = {10, 19, 6, 3, 5};
        int methodOutput = L.findMinSwaps(a);
        assertEquals(expectedOutput, methodOutput);
    }
}