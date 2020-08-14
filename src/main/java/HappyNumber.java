public class HappyNumber {
    //A happy number is a number defined by the following process: Starting with any positive integer,
    // replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
    public static boolean solution(int n) {

        String string;
        do {
            Integer integer = new Integer(n);
            string = integer.toString();

            int size = string.length();
            int result[] = new int[size];
            for (int i = 0; i < size; i++) {
                result[i] = Integer.parseInt(string.substring(i, i + 1));
            }

            n = exponentiationDigits(result);

        } while (string.length() != 1);

        if (n == 1) {
            return true;
        }
        return false;
    }

    public static int exponentiationDigits(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] * arr[i];
        }

        return result;
    }

}
