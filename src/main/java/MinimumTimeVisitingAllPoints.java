import static java.lang.Math.abs;

public class VisitAllPoints {

    public static int minTimeToVisitAllPoints(int[][] points) {

        int result=0;
        int pointSize=points.length;
        for (int i=0; i<pointSize;i++) {
            int tab []= points[i];

            int x1= tab[0];
            int y1= tab[1];

            if (i+1 < pointSize) {
                int tab2 []= points[i+1];
                int x2=tab2[0];
                int y2=tab2[1];

                int sum1= abs(x2-x1);
                int sum2=abs(y2-y1);
                if (sum1> sum2) {
                    result+= sum1;
                } else
                    result+=sum2;
            }
        }
        return result;
    }
}
