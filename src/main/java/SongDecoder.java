public class SongDecoder {
    public static String solution(String song) {

        song = song.replaceAll("WUB", " ");
        StringBuilder str = new StringBuilder(song);
        for (int i = 0; i < str.length(); i++) {
            while (str.charAt(i) == ' ') {
                if (i < str.length() - 1 && str.charAt(i + 1) == ' ') {
                    str.deleteCharAt(i);
                } else if (str.charAt(i) == ' ' && i == 0) {
                    str.deleteCharAt(i);
                } else if (str.charAt(i) == ' ' && i == str.length()) {
                    str.deleteCharAt(i);
                }

            }

        }
        return str.toString();
    }
}
