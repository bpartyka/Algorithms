import java.util.ArrayList;

public class Calculator {
    public static Double evaluate(String expression) {
        expression = expression.replaceAll(" ", "");
        StringBuilder tempExpression = new StringBuilder(expression);

        ArrayList<String> arrayOfResult = new ArrayList<>();
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < tempExpression.length(); i++) {

            if (i == 0) {
                startIndex = i;
            } else if (tempExpression.charAt(i) == '+' || tempExpression.charAt(i) == '-' || tempExpression.charAt(i) == '/' || tempExpression.charAt(i) == '*') {

                endIndex = i;
                arrayOfResult.add(expression.substring(startIndex, endIndex));
                arrayOfResult.add(String.valueOf(tempExpression.charAt(i)));
                startIndex = i + 1;
            } else if (i == tempExpression.length() - 1) {
                endIndex = i + 1;
                arrayOfResult.add(expression.substring(startIndex, endIndex));
            }

        }
        String divisionSign = "/";
        String multiplicationSign = "*";

        int indexOfMultiplicationSign = arrayOfResult.indexOf(multiplicationSign);
        int indexOfDivisionSign = arrayOfResult.indexOf(divisionSign);
        while ((indexOfMultiplicationSign >= 0 && indexOfMultiplicationSign < arrayOfResult.size()) || (indexOfDivisionSign >= 0 && indexOfDivisionSign < arrayOfResult.size())) {
            if ((indexOfMultiplicationSign > indexOfDivisionSign && indexOfDivisionSign > 0) || (indexOfDivisionSign > 0 && indexOfMultiplicationSign < 0)) {
                Double valueBeforeDivisionSign = Double.valueOf(arrayOfResult.get(indexOfDivisionSign - 1));
                Double valueAfterDivisionSign = Double.valueOf(arrayOfResult.get(indexOfDivisionSign + 1));

                Double resultOfDivision = valueBeforeDivisionSign / valueAfterDivisionSign;


                arrayOfResult.remove(arrayOfResult.get(indexOfDivisionSign + 1));

                arrayOfResult.remove(arrayOfResult.get(indexOfDivisionSign));
                arrayOfResult.remove(arrayOfResult.get(indexOfDivisionSign - 1));
                arrayOfResult.add(indexOfDivisionSign - 1, String.valueOf(resultOfDivision));
            } else if ((indexOfDivisionSign > indexOfMultiplicationSign && indexOfMultiplicationSign > 0) || (indexOfMultiplicationSign > 0 && indexOfDivisionSign < 0)) {
                Double valueBeforeMultiplicationSing = Double.valueOf(arrayOfResult.get(indexOfMultiplicationSign - 1));
                Double valueAfterMultiplicationSign = Double.valueOf(arrayOfResult.get(indexOfMultiplicationSign + 1));

                Double resultOfMutiplication = valueBeforeMultiplicationSing * valueAfterMultiplicationSign;


                arrayOfResult.remove(arrayOfResult.get(indexOfMultiplicationSign + 1));

                arrayOfResult.remove(arrayOfResult.get(indexOfMultiplicationSign));
                arrayOfResult.remove(arrayOfResult.get(indexOfMultiplicationSign - 1));
                arrayOfResult.add(indexOfMultiplicationSign - 1, String.valueOf(resultOfMutiplication));

            }

            indexOfMultiplicationSign = arrayOfResult.indexOf(multiplicationSign);
            indexOfDivisionSign = arrayOfResult.indexOf(divisionSign);
        }
        while (arrayOfResult.size() > 1) {

            Double valueBeforeSign = Double.valueOf(arrayOfResult.get(0));
            Double valueAfterSign = Double.valueOf(arrayOfResult.get(2));
            String sign = arrayOfResult.get(1);
            Double result;
            if (sign.equals("+")) {
                result = valueBeforeSign + valueAfterSign;
            } else {
                result = valueBeforeSign - valueAfterSign;
            }

            arrayOfResult.remove(2);
            arrayOfResult.remove(1);
            arrayOfResult.remove(0);


            arrayOfResult.add(0, String.valueOf(result));
        }
        arrayOfResult.toString();
        return Double.valueOf(arrayOfResult.get(0));
    }
}