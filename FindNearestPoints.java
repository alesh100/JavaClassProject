import java.util.Scanner;
public class FindNearestPoints {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of point:");
        int numberOfPoints= input.nextInt();

        //create an array to store points

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter" + numberOfPoints + "points: ");
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        //p1 and p2 are the indices in the points' array
        int p1 = 0, p2 = 1;
        double shortDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][0]);

        //compute distance for every two points
        for(int i = 0; i <points.length; i++){
            for(int j = i + 1; j < points.length; j++){
                double distance = distance(points[i][0], points[p1][1],
                        points[p2][0], points[p2][0]);
                if(shortDistance > distance){
                    p1 = i;
                    p2 = j;
                    shortDistance = distance;
                }
            }
        }

        System.out.print("the closest two points are ( " + points[p1][0] + ", " +
                points[p1][1] + " ) and ( " + points[p2][0] + ", " +
                points[p2][1]);
    }

    //compute the distance btw two points(x1, y1) and (x2, y2)
    public static double distance(
            double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
