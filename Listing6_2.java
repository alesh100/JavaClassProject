public class Listing6_2 {
    public static void main (String [] args) {
        System.out.print("The grade is");
        printGrade(78.5);

        System.out.println("the grade is " + getGrade(20));
    }

    public static void printGrade (double score) {
        if (score > 90)
            System.out.println("A");
        else if (score > 80)
            System.out.println("B");
        else if (score > 70)
            System.out.println("C");
        else if (score > 60)
            System.out.println("D");
        else
            System.out.println("F");
    }

    public static char getGrade (double score) {
        if (score > 90)
            return 'A';
        else if (score > 80)
            return 'B';
        else if (score > 70)
            return 'C';
        else if (score > 60)
            return 'D';
        else
            return 'F';
    }
}
