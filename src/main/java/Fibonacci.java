public class Fibonacci {

    public static int solution(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("number must be >= 0");
        }
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int result = solution(number - 1) + solution(number - 2);
        return result;
    }
}
