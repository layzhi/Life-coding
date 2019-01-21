package dailycodings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NonDecreasingPossible {
    NonDecreasingPossible decreasingPossible;

    @BeforeEach
    public void init() {
        decreasingPossible = new NonDecreasingPossible();
    }

    @Test
    public void test() {
        Assertions.assertEquals(true,decreasingPossible.isPossible(new int[]{10,5,7}));
    }

    @Test
    public void test1() {
        Assertions.assertEquals(false,decreasingPossible.isPossible(new int[]{10,5,1}));
    }

    public boolean isPossible(int[] in) {
        if (in == null || in.length == 0) return false;
        if (in.length == 1) return false;

        int change = 0;
        for (int i = 1; i < in.length; i++) {
            if (in[i] > in[i - 1])
                continue;
            else {
                if (change >= 1)
                    return false;
                else
                    change++;
            }
        }
        return true;
    }
}
