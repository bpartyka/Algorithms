
public class UglyNumber {
    //Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

    public static boolean solution(int a) {
        if (a == 1) {
            return true;
        }
        if (a <= 0) {
            return false;
        }
        while (a >= 10) {
            if (a % 2 == 0) {
                a = a / 2;
            } else if (a % 3 == 0) {
                a = a / 3;
            } else if (a % 5 == 0) {
                a = a / 5;
            } else {
                return false;
            }
        }


        if (a % 2 == 0) {
            return true;
        } else if (a % 3 == 0) {
            return true;
        } else if (a % 5 == 0) {
            return true;
        }
        return false;
    }
}
