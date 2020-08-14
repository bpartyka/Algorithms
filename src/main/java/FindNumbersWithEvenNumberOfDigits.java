public class FindNumbersWithEvenNumberOfDigits {

    public static int solution(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int len = String.valueOf(nums[i]).length();
            if (len % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
