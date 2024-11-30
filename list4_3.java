import java.util.*;
public class list4_3 {
    public static void main (String [] args) {
        String set1 =
                "1  3  5  7\n" +
                "9  11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";
        String set2 =
                        "2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";
        String set3 =
                        "4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";
        String set4 =
                        "8  9  10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";
        String set5 =
                        "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";
        int day = 0;

        //create a scanner
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the answer
        System.out.print("is your birthday in set1?\n");
        System.out.print(set1);
        System.out.print("\n Enter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();

        if(answer == 1)
            day += 1;
        // prompt the user to enter the answer
        System.out.print("is your birthday in set1?\n");
        System.out.print(set2);
        System.out.print("\n Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if(answer == 1)
            day += 2;
        // prompt the user to enter the answer
        System.out.print("is your birthday in set1?\n");
        System.out.print(set3);
        System.out.print("\n Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if(answer == 1)
            day += 4;
        // prompt the user to enter the answer
        System.out.print("is your birthday in set1?\n");
        System.out.print(set1);
        System.out.print("\n Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if(answer == 1)
            day += 8;
        // prompt the user to enter the answer
        System.out.print("is your birthday in set1?\n");
        System.out.print(set1);
        System.out.print("\n Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if(answer == 1)
            day += 16;
        System.out.println("\nYour birthday is " + day + "!");

    }
 }
