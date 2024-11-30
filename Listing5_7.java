
public class Listing5_7 {
    public static void main (String [] args) {
        System.out.println("\t\tMultiplication Table");
        System.out.println("\t-------------------------------------------");
        for(int i = 1; i <= 9; i++){
            System.out.print(i + "|");
            for(int j =1; j <= 9; j++){
                System.out.printf("%4d", j );
            }
            System.out.println();
        }

    }
}
