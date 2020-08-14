public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    //    Product of digits = 2 * 3 * 4 = 24
//    Sum of digits = 2 + 3 + 4 = 9
//    Result = 24 - 9 = 15
    public static int solution(int n) {

        int len = String.valueOf(n).length();
        String str = String.valueOf(n);
        int produkt = 1;
        int sum = 0;
        int result = 0;
        for (int i = 0; i < len; i++) {

            Integer value = Integer.parseInt(String.valueOf(str.charAt(i)));
            produkt *= value;
            sum += value;
        }

        return produkt - sum;
    }
}
