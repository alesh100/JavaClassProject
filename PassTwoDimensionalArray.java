import java.util.Scanner;
public class PassTwoDimensionalArray {
    public static void main (String [] args){
        int[][] m = getArray();

        System.out.println("\n sum of all element " + sum(m));

    }

    // create array
    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " for row and " + m[0].length +
                "for column");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }
    public static int sum(int [][] m){
        int total = 0;
        for(int row = 0; row < m.length; row++)
            for(int column = 0; column < m[row].length; column++)
                total += m[row][column];
        return total;
    }

}
