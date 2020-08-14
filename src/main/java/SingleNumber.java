import java.util.*;

public class SingleNumber {
//    Given a non-empty array of integers, every element appears twice except for one. Find that single one.


    public static int solution(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
            } else {
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();
    }
}
