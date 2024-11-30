import edu.princeton.cs.algs4.*;

public class Randomword {

    public static void main(String args[]) {

        String word = "";

        String champion = "";

        int index = 0;

        while (true) {

            word = StdIn.readString();

            double probability = 1.0 / (index + 1);

            if (Math.random() < probability) {

                champion = word;

            }

            index++;

            if (StdIn.isEmpty()) {

                break;

            }

        }

        System.out.println(champion);

    }
}