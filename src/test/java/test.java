import org.example.BoyerMooreMajorityVote;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    @Test
    public void testSize100() {
        Random random = new Random(42);

        for (int test = 0; test < 400; test++) {
            BoyerMooreMajorityVote algorithm = new BoyerMooreMajorityVote();
            int[] array = new int[100];

            for (int i = 0; i < 100; i++) {
                array[i] = random.nextInt(2);
            }

            Integer result = algorithm.findMajority(array);
            Integer expected = countMajority(array);

            System.out.println("Algo " + result + ", test: " + expected);

            assertEquals(expected, result);
        }
    }

    private Integer countMajority(int[] array) {
        for (int value = 0; value < 1000; value++) {
            int count = 0;
            for (int element : array) {
                if (element == value) {
                    count++;
                }
            }
            if (count > array.length / 2) {
                return value;
            }
        }
        return null;
    }
}
