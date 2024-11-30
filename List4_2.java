import java.util.*;
public class List4_2 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter city1 and city2");
        String city1 = input.nextLine();
        String city2 = input.nextLine();

        if (city1.compareToIgnoreCase(city2) < 0 )
            System.out.println(city1 + " " + city2);
        else
            System.out.println(city2 + " " + city1);
    }
}
