import java.util.Scanner;

public class Listing6_6 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nter n1 and n2");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println("the gcd btw n1 and n2 is " + n1 + " and " +
                n2 + " is " + gcd(n1, n2));
    }

    // method to determine greatest divisor

    public static int gcd(int n1, int n2){
        int gcd = 1;
        int k = 2;
        while(k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }

        return gcd;
    }
}
