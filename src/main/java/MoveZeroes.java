public class MoveZeroes {
    public static int[] solution(int[] nums) {
        int numberOfZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numberOfZeros++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            while (nums[i] == 0 && i != nums.length - 1) {
                count++;
                i++;
            }
            if (count != 0) {
                for (int j = i - count; j < nums.length - count; j++) {
                    nums[j] = nums[j + count];
                }
            }
            i = i - count;

        }
        for (int s = 0; s < numberOfZeros; s++) {
            nums[nums.length - 1 - s] = 0;
        }
        return nums;
    }
}
