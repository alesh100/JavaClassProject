public class Listing6_4 {
    public static void main (String [] args) {
        int x = 1;
        System.out.println("before value of x " + x );
        increment(x);
        System.out.println("after value " + x);
    }

    public static void increment(int n){
        n++;
        System.out.println("The value of the increment is " + n);
    }
}
