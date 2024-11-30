import java.util.*;
public class Listing5_9 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter n1 ");
        int n1 = input.nextInt();
        System.out.print("enter n2");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;

        while(k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k ==0){
                gcd = k; }
                k++;

        }
        System.out.println(gcd);
    }
}
