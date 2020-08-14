import java.util.Arrays;
import java.util.LinkedList;

public class ReversePolishNotation {
    public static String solution(String str) {

        String[] strings = str.split(" ");
        LinkedList<String> values = new LinkedList<>(Arrays.asList(strings));

        while (values.size() != 1) {
            for (int i = 0; i < values.size(); i++) {
                if (values.get(i).equals("+") || values.get(i).equals("-") ||
                        values.get(i).equals("*") || values.get(i).equals("/")) {
                    int result = 0;
                    switch (values.get(i)) {
                        case "+":
                            result = Integer.valueOf(values.get(i - 2)) + Integer.valueOf(values.get(i - 1));
                            break;
                        case "-":
                            result = Integer.valueOf(values.get(i - 2)) - Integer.valueOf(values.get(i - 1));
                            break;
                        case "*":
                            result = Integer.valueOf(values.get(i - 2)) * Integer.valueOf(values.get(i - 1));
                            break;
                        case "/":
                            result = Integer.valueOf(values.get(i - 2)) / Integer.valueOf(values.get(i - 1));
                            break;
                    }
                    values.remove(i);
                    values.remove(i - 1);
                    values.remove(i - 2);
                    values.add(i - 2, String.valueOf(result));
                    i = i - 2;
                }
            }
        }

        return values.get(0);
    }
}
