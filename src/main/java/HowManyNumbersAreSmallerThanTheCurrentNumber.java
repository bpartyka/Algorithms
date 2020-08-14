
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());

        Map<Integer, Integer> map = IntStream.range(0, list.size())
                .boxed()
                .collect(toMap(i -> i, list::get));
        List<Integer> tempList =
                map.values().stream()
                        .sorted(Collections.reverseOrder())
                        .collect(Collectors.toList());

        List<Integer> result = new LinkedList<>();


        for (int x = 0; x < tempList.size(); x++) {

            Integer value = map.get(x);

            int index = tempList.indexOf(value);
            int y = 1;
            while (index + y < tempList.size() && tempList.get(index + y).equals(tempList.get(index))) {
                y++;
            }
            result.add(tempList.size() - index - y);


        }

        return result.stream().mapToInt(i -> i).toArray();

    }
}
