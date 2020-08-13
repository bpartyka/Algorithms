public class SilniaBezRekurencji {

    public static int solution(int inputNumber) {
        int result = 1;
        for (int i = 1; i <= inputNumber; i++
        ) {
            result = result * i;
        }
        return result;
    }
}
