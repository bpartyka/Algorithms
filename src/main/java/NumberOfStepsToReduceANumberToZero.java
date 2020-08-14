public class NumberOfStepsToReduceANumberToZero {
    public static int solution(int i) {

        int result = 0;

        do {
            int value = i / 2;
            if (2 * value != i) {
                result++;
            }
            if (i >= 0) {
                if (value % 2 == 0) {
                    i = value;
                } else {
                    i = value - 1;
                    result++;

                }
            }
            result++;

        } while (i > 0);

        return result;
    }
}
