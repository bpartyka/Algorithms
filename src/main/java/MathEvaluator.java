import java.util.ArrayList;
public class MathEvaluator {

    public double calculate(String expression) {
        expression = expression.replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder(expression);


        ArrayList<String> array = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {

            if (i == 0) {
                start = i;
            } else if (stringBuilder.charAt(i) == ')' || stringBuilder.charAt(i) == '(' || stringBuilder.charAt(i) == '+' || stringBuilder.charAt(i) == '-' || stringBuilder.charAt(i) == '/' || stringBuilder.charAt(i) == '*') {

                end = i;
                array.add(expression.substring(start, end));
                array.add(String.valueOf(stringBuilder.charAt(i)));
                start = i + 1;
            } else if (i == stringBuilder.length() - 1) {
                end = i + 1;
                array.add(expression.substring(start, end));
            }

        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals("")) {
                array.remove(i);
                i--;
            }
            if (i + 1 <= array.size() && array.get(i).equals("+") && array.get(i + 1).equals("-")) {
                array.remove(i);
                i--;
            } else if (i + 1 <= array.size() && array.get(i).equals("-") && array.get(i + 1).equals("-")) {
                array.remove(i + 1);
                array.remove(i);
                array.add(i, "+");
                i--;
                i--;
            }
        }
        String naw1 =  new String("(");
        String naw2 = new String(")");

//        int cc = array.indexOf(naw1);
//        int dd = array.lastIndexOf(naw2);
//        while (cc >= 0) {
//
//            ArrayList<String> arr = new ArrayList<>();
//int size=0;
//            for (int a = cc; a <= dd; a++) {
//                if (a!=cc && array.get(a).equals("(")) {
//                    size++;
//                }
//                if (array.get(a).equals(")")) {
//                    size--;
//                }
//                if (a != cc && a!=dd ) {
//                    arr.add(array.get(a));
//                }
//
//
//
//            }
//
//            if (arr.size() <= 2) {
//                array.remove(dd);
//                array.remove(cc);
//
//                for (int i = 0; i < array.size(); i++) {
//                    if (array.get(i).equals("")) {
//                        array.remove(i);
//                        i--;
//                    }
//                    if (i + 1 <= array.size() && array.get(i).equals("+") && array.get(i + 1).equals("-")) {
//                        array.remove(i);
//                        i--;
//                    } else if (i + 1 <= array.size() && array.get(i).equals("-") && array.get(i + 1).equals("-")) {
//                        array.remove(i + 1);
//                        array.remove(i);
//                        array.add(i, "+");
//                        i--;
//                        i--;
//                    }
//                }
//            } else {
//                for (int a = cc; a <= dd; a++) {
//
//
//                    array.remove(cc);
//
//                }
//                arr.add(0, String.valueOf(ss(arr)));
//                array.add(cc, arr.get(0));
//            }
        ArrayList<String> arr=array;
            int ccc = arr.lastIndexOf(naw1);
//            int ddd = arr.indexOf(naw2);
            while (ccc >= 0) {
                ArrayList<String> arr1 = new ArrayList<>();
                int ddd=0;
                for (int a = ccc; a < array.size(); a++) {
                    if (array.get(a).equals(")")){
                        ddd= a;
                        break;
                    }
                    if (a != ccc ) {
                        arr1.add(arr.get(a));
                    }
                }
                    if (arr1.size() <= 2) {
                        arr.remove(ddd);
                        arr.remove(ccc);

                        for (int i = 0; i < arr.size(); i++) {
                            if (arr.get(i).equals("")) {
                                arr.remove(i);
                                i--;
                            }
                            if (i + 1 <= arr.size() && arr.get(i).equals("+") && arr.get(i + 1).equals("-")) {
                                array.remove(i);
                                i--;
                            } else if (i + 1 <= arr.size() && arr.get(i).equals("-") && arr.get(i + 1).equals("-")) {
                                arr.remove(i + 1);
                                arr.remove(i);
                                arr.add(i, "+");
                                i--;
                                i--;
                            }
                        }
                    } else {
                        for (int aaa = ccc; aaa <= ddd; aaa++) {


                            arr.remove(ccc);

                        }
                        arr1.add(0, String.valueOf(ss(arr1)));
                        arr.add(ccc, arr1.get(0));
                    }





                ccc = arr.lastIndexOf(naw1);
                ddd = arr.indexOf(naw2);



                array = new ArrayList<>();
                 start = 0;
                 end = 0;
                for (int i = 0; i < arr.size(); i++) {

                    if (i == 0) {
                        start = i;
                    }
                    if (arr.get(i).equals(")") || arr.get(i).equals("(") || arr.get(i).equals("+") || arr.get(i).equals("-") || arr.get(i).equals("/") || arr.get(i).equals("*")) {

                        end = i;
                        array.add(expression.substring(start, end));
                        array.add(String.valueOf(stringBuilder.charAt(i)));
                        start = i + 1;
                    } else if (i == stringBuilder.length() - 1) {
                        end = i + 1;
                        arr.add(expression.substring(start, end));
                    }

                }
                for (int i = 0; i < array.size(); i++) {
                    if (array.get(i).equals("")) {
                        array.remove(i);
                        i--;
                    }
                    if (i + 1 <= array.size() && array.get(i).equals("+") && array.get(i + 1).equals("-")) {
                        array.remove(i);
                        i--;
                    } else if (i + 1 <= array.size() && array.get(i).equals("-") && array.get(i + 1).equals("-")) {
                        array.remove(i + 1);
                        array.remove(i);
                        array.add(i, "+");
                        i--;
                        i--;
                    }
                }
            }




//
//                cc = array.indexOf(naw1);
//                dd = array.lastIndexOf(naw2);
//            }


//        array.toString();

            return ss(array);
        }
         public Double ss(ArrayList <String> array) {
            String Dz = "/";
            String Mn = "*";

            int aa = array.indexOf(Mn);
            int bb = array.indexOf(Dz);
            while ((aa >= 0 && aa < array.size()) || (bb >= 0 && bb < array.size())) {
                if ((aa > bb && bb > 0) || (bb > 0 && aa < 0)) {
                    Double value1 = Double.valueOf(array.get(bb - 1));
                    Double value2 = Double.valueOf(array.get(bb + 1));

                    Double sum = value1 / value2;


                    array.remove(array.get(bb + 1));

                    array.remove(array.get(bb));
                    array.remove(array.get(bb - 1));
                    array.add(bb - 1, String.valueOf(sum));
                } else if ((bb > aa && aa > 0) || (aa > 0 && bb < 0)) {
                    Double value1 = Double.valueOf(array.get(aa - 1));

                    Double value2 = Double.valueOf(array.get(aa + 1));

                    Double sum = value1 * value2;


                    array.remove(array.get(aa + 1));

                    array.remove(array.get(aa));
                    array.remove(array.get(aa - 1));
                    array.add(aa - 1, String.valueOf(sum));

                }

                aa = array.indexOf(Mn);
                bb = array.indexOf(Dz);
            }
            while (array.size() > 1) {
                if (array.get(0).equals("-")) {
                    array.remove(0);
                    String a1 = array.get(0);
                    String a2 = "-";
                    a2 = a2.concat(a1);
                    array.remove(0);
                    array.add(0, a2);
                }
                Double value1 = Double.valueOf(array.get(0));
                Double value2 = Double.valueOf(array.get(2));
                String val = array.get(1);
                Double sum;
                if (val.equals("+")) {
                    sum = value1 + value2;
                } else {
                    sum = value1 - value2;
                }

                array.remove(2);
                array.remove(1);
                array.remove(0);


                array.add(0, String.valueOf(sum));
            }
            return Double.valueOf(array.get(0));
        }

    }
