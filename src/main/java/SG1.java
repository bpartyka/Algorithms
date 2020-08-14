import java.lang.*;
import java.io.*;
import java.util.*;

public class SG1 {

    public static String wireDHD(String existingWires) {
        int size = 0;
        boolean globalPoint = false;
        String word = "";
        int record_length = 0;
        for (int i = 0; i <= existingWires.length(); i++) {
            if (i == existingWires.length() || existingWires.charAt(i) == '\n') {
                size++;
                if (size == 1) {
                    record_length = i;
                }
                String newline = "";
                boolean linePoint = false;
                for (int j = i - 1; j >= i - record_length; j--) {
                    char newChar;
                    if (j != i - 1 && j != i - record_length && existingWires.charAt(j) == '.' && existingWires.charAt(j - 1) != '.' && linePoint == false) {
                        newChar = 'P';
                        globalPoint = true;
                        linePoint = true;
                    } else {
                        newChar = existingWires.charAt(j);
                    }
                    newline = newline.concat(String.valueOf(newChar));

                }
                StringBuilder input1 = new StringBuilder();
                input1.append(newline);
                input1 = input1.reverse();
                word = word.concat(input1.toString());
                if (i != existingWires.length()) {

                    word = word.concat("\n");
                }
            }

        }

        existingWires = word;
        int b = existingWires.length();


        for (int i = existingWires.length(); i >= record_length * record_length - record_length; i = i - 1) {
//            if ( i==existingWires.length() ||  existingWires.charAt(i)== '\n' ) {
            int a;
            if (i == existingWires.length()) {
                a = 0;
            } else {
                a = 1;
            }
            int couter = 0;
            String newline = "";
            boolean linePoint = false;
            for (int j = i - 1; j >= 0; j = j - record_length) {
                char newChar;
                couter++;
                if (couter != 1 && couter != record_length && (j - record_length - 1) >= 0 && existingWires.charAt(j - record_length - 1) != '.' && existingWires.charAt(j) == '.' && linePoint == false) {
                    linePoint = true;
                    globalPoint = true;
                    StringBuilder myString = new StringBuilder(existingWires);
                    myString.setCharAt(j, 'P');
                    existingWires = myString.toString();

//                        char[] array = existingWires.toCharArray();
//                        array[j] = 'P';
//
//                        existingWires = String.valueOf(array);
                }
//                    else {
//                        newChar= existingWires.charAt(j);
//                    }
//                    newline = newline.concat(String.valueOf(newChar));

            }
//                StringBuilder input1 = new StringBuilder();
//                input1.append(newline);
//                input1= input1.reverse();
//                word = word.concat(input1.toString());
//                if ( i!=existingWires.length() ) {
//
//                    word = word.concat("\n");
//                }
////            }

        }
//      return Integer.toString(size);


        if (globalPoint == false) {
            return "Oh for crying out loud...";
        } else {
            return existingWires;
        }
    }
}