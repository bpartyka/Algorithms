public class RunningSumOf1dArray {
    public static int[] solution(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++
        ) {
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }
}
