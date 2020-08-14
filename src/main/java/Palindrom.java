public class Palindrom {

    public static boolean solution(String text) {

        if (text == "") {
            throw new IllegalArgumentException("text cannot be empty");
        }

        text = text.toLowerCase();
        text = text.replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder(text);

        int length = stringBuilder.length();

        int start = -1;
        int end = length;
        while (start <= end) {
            start++;
            end--;
            if (stringBuilder.charAt(start) == stringBuilder.charAt(end)) {
                if (start + 1 >= end) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
